package fr.univpau.exo4;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Sender extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage msg = new ACLMessage();
        msg.setSender(getAgent().getAID());
        msg.addReceiver(new AID("A2", AID.ISLOCALNAME));
        msg.setContent("salut");
        this.getAgent().send(msg);
    }
}
