package fr.univpau.exo4;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Receiver extends CyclicBehaviour {
    @Override
    public void action() {
        ACLMessage msg = getAgent().receive();
        if (msg != null) {
            System.out.println("message reçu: \n" +
                    "Receveur: " + getAgent().getAID().getName() + "\n" +
                    "Expediteur: " + msg.getSender().getName() + "\n" +
                    "Performative: " + ACLMessage.getPerformative(msg.getPerformative()) + "\n" +
                    "Contenu: " + msg.getContent());

            ACLMessage resp  = msg.createReply();
            resp.setContent("message reçu!");
            this.getAgent().send(resp);
        } else {
            block();
        }
    }
}
