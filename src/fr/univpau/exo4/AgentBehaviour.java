package fr.univpau.exo4;

import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ReceiverBehaviour;
import jade.lang.acl.ACLMessage;

import static jade.lang.acl.ACLMessage.INFORM;
import static jade.lang.acl.ACLMessage.REQUEST;

public class AgentBehaviour extends OneShotBehaviour {
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
        if (manager != null && this.manager.isAlive()) {
            switch (step) {
                case 0:
                    // attente
                    step = 0;
                case 1:
                    // send
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
                case 2:
                    System.out.println("Manager terminé !");
                    step = 2;
                    break;
                                }
        } else if (printer != null && this.printer.isAlive()) {
            switch (step) {
                case 0 :
                    System.out.println("Hello World first time !");
                    step = 0;
                    break;
                case 1 :

            }
        }
    }
}
