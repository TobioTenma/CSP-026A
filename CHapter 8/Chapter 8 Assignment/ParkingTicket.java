public class ParkingTicket {
	
	//Making a refrence
	private ParkedCar carPs;
	
	private PoliceOfficer policePs;
	
	private ParkingMeter parkedMS;
	
	

	
	public ParkingTicket(ParkedCar a, PoliceOfficer b, ParkingMeter c){
		this.carPs=a;
		this.policePs=b;
		this.parkedMS=c;

	}
	
	  public String toString() {
			return "The fine is "+ totalFine + "From officer " + copName + " badge number " + badgeNum
					+ " the car makes, model, coler, and licinse number is " + make +", " + model + 
					color + licenseNum;
		}
}

