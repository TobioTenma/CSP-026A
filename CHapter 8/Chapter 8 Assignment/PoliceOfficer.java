public class PoliceOfficer{
   
    private String copName;
    private double badgeNum;
    private double boughtTime;
    private double totalTime;
    private double totalFine;
    

    public PoliceOfficer(String copName, double badgeNum, double boughtTime){

    super();
    this.copName = copName;
    this.badgeNum = badgeNum;
    

    }
    
    
    //cops name
    public String getcopName()
    {

       return copName;
    }
    
    //bagde number
    public double getbadgeNum()
    {

    	return this.badgeNum;
    }
    
   //Finds if the car has overstayed parking
    double total (ParkedCar carStuff){
    	
        totalTime = boughtTime - carStuff.getHour();
    	
    	return totalTime;
    }
    
 

    //Determines if the car overstaed parking
        public double calculateFine(double totalTime) {

            if (totalTime > 0){
            	
            	 totalFine = totalTime * 25;
            
            	 return totalFine;
            }
            
        return 0;
        }
            	
            	
       
}
