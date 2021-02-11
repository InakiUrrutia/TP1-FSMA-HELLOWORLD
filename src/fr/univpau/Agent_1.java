package fr.univpau;

import jade.core.Agent;

public class Agent_1 extends Agent {
    @Override
    protected void setup() {
        System.out.println("Hello");
        super.setup();
    }

    @Override
    protected void takeDown() {
        super.takeDown();
        System.out.println("Good");
    }
}
