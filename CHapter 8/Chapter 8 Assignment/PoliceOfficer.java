public class PoliceOfficer{
   
    private String copName;
    private double badgeNum;
    private double boughtTime;
    private double totalTime;
    private double totalFine;

    public PoliceOfficer(String copName, double badgeNum){

    this.copName = copName;
    this.badgeNum = badgeNum;
    

    }
    
    
    //cops name
    public String getcopName()
    {

       return this.copName;
    }
    
    //bagde number
    public double getbadgeNum()
    {

    	return this.badgeNum;
    }
    

    
   //Finds if the car has overstayed parking
    double total (ParkedCar carStuff){
    	
        totalTime =  carStuff.getHour() - boughtTime;
    	
    	return this.totalTime;
    }
    
 

   // Determines if the car overstaed parking
    public double getCalculateFine() {

        return this.totalFine = totalTime * 25;
    }
          

       
}
