package fr.univpau.exo4;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class MyAgentManager extends Agent {
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, 10000) {
            @Override
            protected void onTick() {

            }
        });
    }
}
