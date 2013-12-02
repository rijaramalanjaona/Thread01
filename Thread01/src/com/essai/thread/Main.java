package com.essai.thread;

public class Main {
    @SuppressWarnings("static-access")
    public Main() {
	// cr�ation d'une instance du thread
	UnThread thread = new UnThread();
	// Activation du thread
	thread.start();
	// tant que le thread est en vie...
	while (thread.isAlive()) {
	    // faire un traitement...
	    System.out.println("Ligne affich�e par le main");
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
