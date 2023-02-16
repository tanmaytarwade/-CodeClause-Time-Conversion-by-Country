import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import javax.swing.JOptionPane;


public class MainConverter {

	int countryNum;
	int hourDiff;
	String destination;
	
	
	public void destination() {

		MainConverter first = new MainConverter();
		MainConverter second = new MainConverter();
		MainConverter third = new MainConverter();
		MainConverter fourth = new MainConverter();
		MainConverter fifth = new MainConverter();
		MainConverter sixth = new MainConverter();
		MainConverter seventh = new MainConverter();
		
		first.destination = "Bejing";
		first.countryNum = 1;
		first.hourDiff = 8;
		
		second.destination = "Sydney";
		second.countryNum = 2;
		second.hourDiff = 10;
		
		third.destination = "Moscow";
		third.countryNum = 3;
		third.hourDiff = 3;
		
		fourth.destination = "Florida";
		fourth.countryNum = 4;
		fourth.hourDiff = -4;
		
		fifth.destination = "California";
		fifth.countryNum = 5;
		fifth.hourDiff = -7;
		
		sixth.destination = "Paris";
		sixth.countryNum = 6;
		sixth.hourDiff = 1;
			
		seventh.destination = "Mexico City";
		seventh.countryNum = 7;
		seventh.hourDiff = -5;
		
		System.out.println("");
		Locale currentLocale = Locale.getDefault();
		System.out.print("Your Country is: ");
		System.out.println(currentLocale.getDisplayCountry());
		System.out.print("Current time in your Timezone (24 hour HH:MM format): ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		int hh = Integer.parseInt(s.substring(0,2));
		int mm = Integer.parseInt(s.substring(3));
		
		System.out.println((String.format("%02d", hh)) + ":" + (String.format("%02d", mm)));
				
		System.out.println("--Choose a Destination:--");
		System.out.println(first.countryNum + ")" + first.destination + "\n" + second.countryNum + ")" + second.destination + "\n" + third.countryNum + ")" + third.destination + "\n" + fourth.countryNum + ")" + fourth.destination + "\n"  + fifth.countryNum + ")" + fifth.destination + "\n"  + sixth.countryNum + ")" + sixth.destination + "\n" + seventh.countryNum + ")" + seventh.destination);
			    
		
		int country1 = first.hourDiff + hh;
		if (country1 < 0) {
			country1 += 24;
		}else if (country1 >= 24) {
			country1 = (country1 - 24);
		}
		int country2 = second.hourDiff + hh;
		if (country2 < 0) {
			country2 += 24;
		}else if (country2 >= 24) {
			country2 = (country2 - 24);
		}
		int country3 = third.hourDiff + hh;
		if (country3 < 0) {
			country3 += 24;
		}else if (country3 >= 24) {
			country3 = (country3 - 24);
		}
		int country4 = fourth.hourDiff + hh;
		if (country4 < 0) {
			country4 += 24;
		}else if (country4 >= 24) {
			country4 = (country4 - 24);
		}
		int country5 = fifth.hourDiff + hh;
		if (country5 < 0) {
			country5 += 24;
		}else if (country5 >= 24) {
			country5 = (country5 - 24);
		}
		int country6 = sixth.hourDiff + hh;
		if (country6 < 0) {
			country6 += 24;
		}else if (country6 >= 24) {
			country6 = (country6 - 24);
		}
		int country7 = seventh.hourDiff + hh;
		if (country7 < 0) {
			country7 += 24;
		}else if (country7 >= 24) {
			country7 = (country7 - 24);
		}
			
		boolean chooser = true;
		while (chooser) {
		chooser = false;
		
		int s1 = sc.nextInt();
		if (s1 == first.countryNum) {												
			System.out.println("Time in "+ first.destination + " is Currently: " + (String.format("%02d", country1)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == second.countryNum) {
			System.out.println("Time in "+ second.destination + " is Currently: " + (String.format("%02d", country2)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == third.countryNum){
			System.out.println("Time in "+ third.destination + " is Currently: " + (String.format("%02d", country3)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == fourth.countryNum){
			System.out.println("Time in "+ fourth.destination + " is Currently: " + (String.format("%02d", country4)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == fifth.countryNum){
			System.out.println("Time in "+ fifth.destination + " is Currently: " + (String.format("%02d", country5)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == sixth.countryNum){
			System.out.println("Time in "+ sixth.destination + " is Currently: " + (String.format("%02d", country6)) + ":" + (String.format("%02d", mm)));
		} else if (s1 == seventh.countryNum){
			System.out.println("Time in "+ seventh.destination + " is Currently: " + (String.format("%02d", country7)) + ":" + (String.format("%02d", mm)));
		} else {
			System.out.println("Incorrect entry, Please try again.");
			chooser = true;
			}
	}
}
		
	public void customConv() {
		List<Timezone> timeList = new ArrayList<Timezone>(10);
		 String destination;
		 int hourDiff;
		 int index = 0;
	   
	   System.out.println("");
	   Locale currentLocale = Locale.getDefault();
	   System.out.print("Your Country is: ");
	   System.out.println(currentLocale.getDisplayCountry());
	   System.out.print("Current time in your Timezone (24 hour HH:MM format): ");
	   
	   Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		int hh = Integer.parseInt(s.substring(0,2));
		int mm = Integer.parseInt(s.substring(3));
		
		System.out.println((String.format("%02d", hh)) + ":" + (String.format("%02d", mm)));
	  

		// Scanner accepts input from the user

		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1 ; i < 3 ; i++){

		
		
		System.out.println("Enter Destination "+ i +" Name:");

		destination  = keyboard.next();
		
		System.out.println("Enter Destination "+ i + "'s Hour Difference from GMT (use negative value if behind):");

		hourDiff = keyboard.nextInt();
		
		
		// Each time zone object is created and added to the times list
		
		
		 Timezone times = new Timezone(index, destination, hourDiff);
		 	timeList.add(times);
		 	
		}
		
		
		
			for (Timezone num : timeList) { 	
				index = index + 1;
		           System.out.println(index + ") " + "Destination: " + num.getDestination()+ "  " + "Hour Difference: "+ num.getHourDiff()); 		
			}
			System.out.println("");
			
			
		for (Timezone num2 : timeList) {
			
			int num10 = num2.getHourDiff() + hh;
			int num11 = num2.getHourDiff() + hh;
			if (num10 < 0) {
				 num10 = num10 + 24;
				 System.out.println("Time in "+ num2.getDestination() + " is Currently: " + (String.format("%02d", num10)) + ":" + (String.format("%02d", mm))); 		
			} else if (num11 >= 24) {
					num11 = num11 - 24;
				System.out.println("Time in "+ num2.getDestination() + " is Currently: " + (String.format("%02d", num11)) + ":" + (String.format("%02d", mm))); 		
			}else {
			  System.out.println("Time in "+ num2.getDestination() + " is Currently: " + (String.format("%02d", num2.getHourDiff() + hh)) + ":" + (String.format("%02d", mm))); 		
			}
		}	
		
	}
		
	public static void main(String[] args) {
		
		MainConverter conv = new MainConverter();
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		char returner = '0';
		while (returner != 'Y') {
		
		boolean sequence = true;
		while (sequence) {
		sequence = false;
		
		System.out.println("------Main Menu------");
		System.out.println("");
		System.out.println("A: Timezone Converter");
		System.out.println("B: Custom Timezone Converter");
		System.out.println("Q: Quit");
		
		String answers = JOptionPane.showInputDialog("Choose an option: ");
		char answer = answers.charAt(0);
		
		 
	
		switch(answer) {
		
			case 'A': 
			case 'a':
					conv.destination();
				break; 
		      
		   case 'B':
		   case 'b':
			   conv.customConv();
			   
		      break;
		      
		   case 'Q':
		   case 'q':
			   System.out.println("Thanks for using the converter!");
		   	   System.exit(0);
		      break; 
			   
		   default : 
			 System.out.println("");
		     System.out.println("Invalid entry please try again!");
		     sequence = true;
		  
		}
		System.out.println("Would you like to Quit? Y/N");
		String s = sc1.next().toLowerCase(); 
		returner = s.charAt(0);
		
		}
	}
		
	}


}
