package hr.as2.app.server;

import hr.as2.inf.common.core.AS2Application;
import hr.as2.inf.server.requesthandlers.rmi.AS2ServerRequestHandlerRmi;

public class PisServer extends AS2Application {

	@Override
	protected void init(String[] args) {
		AS2ServerRequestHandlerRmi.getInstance();		
	}

	@Override
	protected void run() {
		
	}

	@Override
	protected void shoutDown() {
		AS2ServerRequestHandlerRmi.getInstance().destroy();	
		
	}
	public static void main(String[] args) {
		PisServer s = new PisServer();
		s.init(null);	
	}
	public void finalize() {
		shoutDown();
	}
}
