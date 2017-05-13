public class PoliceOfficer{
   
    private String copName;
    private double badgeNum;
    private double boughtTime;
    private double totalTime;
    private double totalFine;
	public double getCalculateFine;
    

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
    	
        totalTime = boughtTime - carStuff.getHour();
    	
    	return totalTime;
    }
    
 

    //Determines if the car overstaed parking
        public double getCalculateFine() {

            if (totalTime > 0){
            	
            	 totalFine = totalTime * 25;
            
            	 return this.totalFine;
            }
            
            return this.totalFine;
        }
          

       
}
