package fr.univpau.exo2;

import jade.core.behaviours.Behaviour;

public class MyThreeStepBehaviour extends Behaviour {
    private int step = 0;

    public int getStep() {
        return step;
    }
    @Override
    public void action() {
        System.out.println(myAgent.getAID().getName() + "Hello World !");
        step++;
    }

    @Override
    public boolean done() {
        return !(step<3);
    }
}
