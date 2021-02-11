package fr.univpau;

import fr.univpau.exo4.Receiver;
import jade.core.Agent;

public class Agent_2 extends Agent {
    @Override
    protected void setup() {
        System.out.println("World");
        super.setup();
        addBehaviour(new Receiver());
    }

    @Override
    protected void takeDown() {
        super.takeDown();
        System.out.println("Bye");
    }
}
