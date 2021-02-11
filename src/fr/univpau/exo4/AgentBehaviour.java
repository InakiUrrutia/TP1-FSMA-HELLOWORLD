package fr.univpau.exo4;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

import static jade.lang.acl.ACLMessage.INFORM;
import static jade.lang.acl.ACLMessage.REQUEST;

public class AgentBehaviour extends Behaviour {
    MyAgentManager manager;
    MyAgentPrinter printer;
    int step;

    AgentBehaviour(MyAgentManager manager) {
        this.manager = manager;
    }

    AgentBehaviour(MyAgentPrinter printer) {
        this.printer = printer;
    }

    int getStep() {
        return step;
    }

    @Override
    public void action() {

        if (printer != null && this.printer.isAlive()) {
            switch (step) {
                case 0:
                    System.out.println("Hello World first time !");
                    step = 0;
                    break;
                case 1:
                    // attente reception message

                    // réagit aux messages
                    ACLMessage msg = manager.receive();
                    if (msg != null) {
                        switch (msg.getPerformative()) {
                            case REQUEST:
                                System.out.println("Hello World !");
                                break;
                            case INFORM:
                                System.out.println("Hello World, last time !");
                                break;
                            default:
                                break;
                        }
                    }
                    step = 1;
                    break;
            }
        } else if (manager != null && this.manager.isAlive()) {
            switch (step) {
                case 1 :
                    int i = 0;
                    // send message REQUEST
                    while(i <3) {
                        ACLMessage msg = new ACLMessage(REQUEST);
                        msg.addReceiver(new AID("Alice", AID.ISLOCALNAME));
                        manager.send(msg);
                        i++;
                    }
                    step = 1;
                    break;
                case 2 :
                    // send message INFORM
                    ACLMessage msg = new ACLMessage(INFORM);
                    msg.addReceiver(new AID("Alice", AID.ISLOCALNAME));
                    manager.send(msg);
                    step = 2;
                    break;
                case 3 :
                    System.out.println("Manager terminé !");
                    step = 3;
                    break;
            }
        }
    }

    @Override
    public boolean done() {
        return true;
    }
}
