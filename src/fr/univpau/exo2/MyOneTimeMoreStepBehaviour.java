package fr.univpau.exo2;

import jade.core.behaviours.Behaviour;

public class MyOneTimeMoreStepBehaviour extends Behaviour {

    private MyThreeStepBehaviour threeStepBehaviour;

    public MyOneTimeMoreStepBehaviour(MyThreeStepBehaviour threeStepBehaviour) {
        this.threeStepBehaviour = threeStepBehaviour;
    }

    @Override
    public void action() {
        if (threeStepBehaviour.getStep() == 2) {
            System.out.println(myAgent.getAID().getName() + "One time more...");
        }
    }

    @Override
    public boolean done() {
        return threeStepBehaviour.getStep() == 2;
    }
}
