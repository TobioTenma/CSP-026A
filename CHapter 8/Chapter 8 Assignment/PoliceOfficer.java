public class PoliceOfficer extends ParkingMeter {
   
	//Hour and hour Spent is suppose to be from ParkedCar
	private ParkedCar hourSpent;
    private double time;
	private double fine;
	
	private double hour;
    
    
    private double hoursParked;
    private String copName;
    private double badgeNum;
    

    public PoliceOfficer(double boughtTime, double fine, double hours, String copName, double badgeNum, double hour){

    super(boughtTime);
    fine = fine;
    hoursParked = hoursParked;
    copName = copName;
    badgeNum = badgeNum;
    
    hour = hourSpent.getHour();

    }
    
    //Gets time spent parked
    public double PoliceOfficer(double time){
    
    time = boughtTime - hour;
    
    return time;
    }
    
    //cops name
    public String getcopName()
    {

       return copName;
    }
    
    //bagde number
    public double getbadgeNum()
    {

       return 0;
    }
    
    
 

    //calculating fine
        public double calculateFine() {

        fine = boughtTime - hour;

        if (time > 0) {
            fine = fine * 25;
            
            return fine;
            
        }
        return 0;
    }



}
