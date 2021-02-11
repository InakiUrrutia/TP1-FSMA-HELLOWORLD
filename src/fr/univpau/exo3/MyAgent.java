package fr.univpau.exo3;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class MyAgent extends Agent {
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, 10000) {
            protected void onTick() {
                System.out.println("Hello World !");
            }
        } );
    }
}
