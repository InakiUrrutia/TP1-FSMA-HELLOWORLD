package fr.univpau.exo2;

import jade.core.Agent;
import jade.core.behaviours.*;

public class HelloWorldAgent extends Agent {
	// Define agent properties here
	private String myName;

	// Put agent initializations here
	protected void setup() {
		// Printout a welcome message
		System.out.println("Hello! Agent "+getAID().getName()+" is ready.");

		// Get the name of the agent as a start-up argument
		Object[] args = getArguments();
		if (args != null && args.length > 0) {
			myName = (String) args[0];
			
			// Printout the name
		    System.out.println("My name is "+myName);
			
			// Add behaviour
			MyThreeStepBehaviour threeStepBehaviour = new MyThreeStepBehaviour();
			addBehaviour(new MyOneShotBehavior());
			addBehaviour(threeStepBehaviour);
			addBehaviour(new MyOneTimeMoreStepBehaviour(threeStepBehaviour));
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
}
