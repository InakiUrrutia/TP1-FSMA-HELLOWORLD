package fr.univpau.exo1;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class HelloWorldAgent extends Agent {
	// Define agent properties here
	private String myName;

	// Put agent initializations here
	protected void setup() {
		// Printout a welcome message
		System.out.println("Hallo! Agent "+getAID().getName()+" is ready.");

		// Get the name of the agent as a start-up argument
		Object[] args = getArguments();
		if (args != null && args.length > 0) {
			myName = (String) args[0];
			
			// Printout the name
		    System.out.println("My name is "+myName);
			
			// Add behaviour
			addBehaviour(new PrintHelloWorld());
		}
		else {
			// Make the agent terminate
			System.out.println("No name specified");
			doDelete();
		}
	}

	// Put agent clean-up operations here
	protected void takeDown() {
		// Printout a dismissal message
		System.out.println("Agent "+getAID().getName()+" terminating.");
	}

	/**
	   Inner class PrintHelloWorld.
	   This is a behaviour , should be declared in an external file
	 */
	private class PrintHelloWorld extends Behaviour {
		private int step = 0;

		public void action() {
			System.out.println(myAgent.getAID().getName()+" Hello World !");
			step++;
			}        

		public boolean done() {
			if (step == 3){
				System.out.println(myAgent.getAID().getName()+" One time more...");
			}
			return (step == 4);
		}
	}  // End of inner class PrintHelloWorld
}
