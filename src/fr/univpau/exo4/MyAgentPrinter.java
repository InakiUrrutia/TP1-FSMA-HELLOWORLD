package fr.univpau.exo4;

import jade.core.Agent;

public class MyAgentPrinter extends Agent {
    private static final int REQUEST = 16;
    private static final int INFORM = 7;

    @Override
    protected void setup() {
        // Add behaviour
        addBehaviour(new AgentBehaviour((MyAgentPrinter) this.getAgent()));
    }

    private Object getAgent() {
        return this.getAgent();
    }
}
