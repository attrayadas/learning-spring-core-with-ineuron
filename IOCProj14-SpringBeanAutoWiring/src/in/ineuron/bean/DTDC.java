package in.ineuron.bean;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading...");
	}

	public DTDC() {
		System.out.println("DTDC object is instantiated...");
	}

	@Override
	public String deliver(int oid) {
		return "BlueDart courier will deliver with the order id :: " + oid + " order products";
	}

}
