public class ParkingTicket {
	
	//Making a refrence
	private PoliceOfficer officer;
	private String officerName;
	private double officerBadgeNumber;
	//Making a refrence
	private  ParkingMeter bTime;
	private double boughtTime;
	
	
	public ParkingTicket(double boughtTime, ParkingMeter bTime, PoliceOfficer officer)
	{	
		officer = officer;
		officerName = officer.getcopName();
		officerBadgeNumber = officer.getbadgeNum();
		
		bTime = bTime;
		boughtTime  = bTime. getboughtTime();
		
	}
	
	  public String toString() {
			return "The time they bought is "+ boughtTime + ". ";
		}
}
