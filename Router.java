package Assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Router {
	private RoutingTableEntry[] routingTable;
	private int maxEntries;
	private int numEntries;
	Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) throws IOException,
			FileNotFoundException {

		String fileName;
		Router router = new Router();
		boolean input = false;
		StringBuffer buffer = new StringBuffer();
		String ipAddress;

		Scanner scanner = new Scanner(System.in);

		while (input == false) {
			System.out.println("Please enter the name of the file to open: ");
			fileName = scanner.nextLine();
			try (BufferedReader in = new BufferedReader(
					new FileReader(fileName))) {
				while ((ipAddress = in.readLine()) != null) {
					buffer.append(ipAddress);
					buffer.append("\n");
				}

				System.out.println("The contents of the file: ");
				System.out.println(buffer.toString());
				System.out.println("EOF");
				input = true;
			} catch (FileNotFoundException fileNotFound) {
				System.out
						.println("Invalid file name. Please enter a valid file name.");
			}
		}
	}

	Router() {

		Scanner scanner = new Scanner(System.in);
		boolean error = false;
		do {
			maxEntries = 0;
			try {
				System.out.println("How big would you like your table?");
				maxEntries = scanner.nextInt();
				error = false;
			} catch (InputMismatchException inputException) {
				scanner.next();
				System.out
						.println("Invalid character entered. Please enter valid characters.");
				error = true;

			}

		} while (error == true);

	}

	void processPackets() {

	}

	void displayTable() {
		
		for(int i = 0; i < routingTable.length; i++){
			System.out.println(routingTable[i] + "\n");
		}

	}

}
