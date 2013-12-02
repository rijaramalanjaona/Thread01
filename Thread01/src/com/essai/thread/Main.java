package com.essai.thread;

public class Main {
    @SuppressWarnings("static-access")
    public Main() {
	// création d'une instance du thread
	UnThread thread = new UnThread();
	// Activation du thread
	thread.start();
	// tant que le thread est en vie...
	while (thread.isAlive()) {
	    // faire un traitement...
	    System.out.println("Ligne affichée par le main");
	    try {
		// et faire une pause
		thread.sleep(800);
	    } catch (InterruptedException ex) {
	    }
	}
    }

    public static void main(String[] args) {
	new Main();
    }

}
