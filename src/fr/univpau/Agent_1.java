package fr.univpau;

import fr.univpau.exo4.Receiver;
import fr.univpau.exo4.Sender;
import jade.core.Agent;

public class Agent_1 extends Agent {
    @Override
    protected void setup() {
        System.out.println("Hello");
        super.setup();
        addBehaviour(new Sender());
        addBehaviour(new Receiver());
    }

    @Override
    protected void takeDown() {
        super.takeDown();
        System.out.println("Good");
    }
}
