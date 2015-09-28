package Assignment1;

public class RoutingTableEntry {
	
	private IPAddress destination;
	private String portCode;
	
	RoutingTableEntry(){
		
	}
	
	void addEntry(IPAddress destination, String portCode){
		
		this.destination = destination;
		this.portCode = portCode;
		
	}
	
	public String toString(){
		String data = destination + " " + portCode;
		return data;
	}
	
	String searchForPort(IPAddress ins){
		
		if(destination.isEqual(ins)){
			return portCode;
		} else {
			return null;
		}
		
	}

}
