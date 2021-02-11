package fr.univpau.exo4;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class MyAgentManager extends Agent {

    protected void setup() {
        // Add behaviour
        addBehaviour(new WakerBehaviour(this, 10000) {
            protected void handleElapsedTimeout() {
                addBehaviour(new AgentBehaviour((MyAgentManager) this.getAgent()));
            }
        } );
    }
}
