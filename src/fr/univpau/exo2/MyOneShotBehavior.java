package fr.univpau.exo2;

import jade.core.behaviours.OneShotBehaviour;

public class MyOneShotBehavior extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println(myAgent.getAID().getName() + "Hello World first time");
    }
}

