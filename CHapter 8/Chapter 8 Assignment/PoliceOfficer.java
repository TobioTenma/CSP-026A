public class PoliceOfficer extends ParkingMeter {
    private double fine;
    private double hoursParked;
    private double totalFine;
    private String copName;
    private double badgeNum;

    public PoliceOfficer(double boughtTime, double fine, double hours, String copName, double badgeNum){

    super(boughtTime);
    fine = fine;
    hoursParked = hoursParked;
    copName = copName;
    badgeNum = badgeNum;

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

        fine = boughtTime - hoursParked;

        if (fine > 0) {
            totalFine = fine * 25;
            
            return fine;
            
        }
        return 0;
    }

}
