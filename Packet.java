package Assignment1;

import java.util.Scanner;

public abstract class Packet {
	
	private IPAddress sourceAddress;
	private IPAddress destinationAddress;
	private String packetData;
	Scanner scanner = new Scanner(System.in);
	
	Packet(){
		
	}
	
	boolean readPacket(Scanner scanner){

		return false;
		
	}
	
	IPAddress getDestNetwork(){
		return destinationAddress;
		
	}
	
	boolean processFoundPacket(String packetData){
		return false;
		
	}
	
	boolean processNotFoundPacket(String packetData){
		return false;
		
	}
	
	String getPacketData(){
		return packetData;
	}

}
