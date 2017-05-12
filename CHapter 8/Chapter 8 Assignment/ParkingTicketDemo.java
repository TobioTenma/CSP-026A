import java.util.Scanner;

public class ParkingTicketDemo {


	private static final ParkingTicket fine = null;

	public static void main(String[] args) 
	{

	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.println("What is the bought time?");
	     double boughtTime = scanner.nextDouble();
	     
	     System.out.println("How long has it been there");
	     double hour = scanner.nextDouble();
	     
	     System.out.println("WHat is the cars make?");
	     String make = scanner.nextLine();

	     System.out.println("WHat is the cars model?");
	     String model = scanner.nextLine();
	     
	     System.out.println("WHat is the cars color?");
	     String color = scanner.nextLine();
	     
	     System.out.println("WHat is the cars licinse number");
	     double licenseNum = scanner.nextDouble();
	     
	     ParkedCar parked = new ParkedCar(make, model, color, licenseNum, hour);
	     ParkingMeter parkmete = new ParkingMeter(boughtTime);
	     PoliceOfficer policecop = new PoliceOfficer(hour, hour, hour, null, hour, hour);
  		 ParkingTicket parktic = new ParkingTicket(fine);


	      System.out.println(parktic);


	
	}
}
