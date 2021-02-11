package fr.univpau;

import jade.core.Agent;

public class Agent_2 extends Agent {
    @Override
    protected void setup() {
        System.out.println("World");
        super.setup();
    }

    @Override
    protected void takeDown() {
        super.takeDown();
        System.out.println("Bye");
    }
}
