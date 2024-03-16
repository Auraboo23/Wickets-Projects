package bookingSimulator;

import java.util.Scanner;

public class TravelApp {

	public static void main (String[]args) {
		int userinput = 0;
		Bus b = new Bus();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to TravelApp");
		System.out.println("Press 1 for bus");
		System.out.println("Press 2 for train");
		
		userinput= sc.nextInt();
		
		switch(userinput) {
		case 1:
			System.out.println("Select a bus from available option:");
			System.out.println("1."+b.getBus1());
			System.out.println("2."+b.getBus2());
			System.out.println("3."+b.getBus3());
			userinput= sc.nextInt();
			switch(userinput) {
			case 1:
				System.out.println("Number Of Seats available = 20");
			}
		}
	}

}
