import java.util.Scanner;

public class ParkingTicketDemo {

	public static void main(String[] args) 
	{

	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.println("What is the bought time?");
	     double boughtTime = scanner.nextDouble();
	     
	     
	     ParkingTicket parkmete = new ParkingTicket( boughtTime, null, null);
	
	
	
	}
}
