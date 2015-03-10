package hr.adriacomsoftware.app.server.main;

import hr.as2.inf.server.requesthandlers.rmi.AS2ServerRequestHandlerRmi;

public class Start {
	public static void main(String[] args) {
		AS2ServerRequestHandlerRmi.getInstance();
	}
}
