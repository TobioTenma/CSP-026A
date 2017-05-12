public class ParkingTicket {
	
	//Making a refrence
	private PoliceOfficer officerStuff;
	private String copName;
	private double badgeNum;
	private double fine;
	
	//Making a refence
	private ParkedCar parkCar;
	private String make;
	private String model;
	private String color;
	private double licenseNum;
	
	public ParkingTicket(double boughtTime, PoliceOfficer officer, double fine)
	{	
		officer = officer;
		copName = officerStuff.getcopName();
		badgeNum = officerStuff.getbadgeNum();
		fine = officerStuff.calculateFine();
		
		make = parkCar.getMake();
		model = parkCar.getModel();
		color = parkCar.getColor();
		licenseNum = parkCar.getLicenseNum();
		
		
	}
	
	
	  public ParkingTicket(ParkingTicket rd)
	  {
	 
	      this.fine = rd.fine;
	 
	 }
	
	  public String toString() {
			return "The fine is "+ fine + "From officer " + copName + " badge number " + badgeNum
					+ " the car makes, model, coler, and licinse number is " + make +", " + model + 
					color + licenseNum;
		}
}
