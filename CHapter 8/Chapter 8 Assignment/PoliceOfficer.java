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
    	
        totalTime =  carStuff.getHour() - boughtTime;
    	
    	return totalTime;
    }
    
 

    //Determines if the car overstaed parking
        public double getCalculateFine() {

             
            	
            	 totalFine = totalTime * 25;
            
            	 
            
            return totalFine;
        }
          

       
}
