public class PoliceOfficer{
   
    private String copName;
    private double badgeNum;
    

    public PoliceOfficer(String copName, double badgeNum){

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
    double total (ParkedCar carStuff, double boughtTime){
    	
    	double totalTime = boughtTime - car.getHour;
    	
    	return totalTime;
    }
    
 

    //Determines if the car overstaed parking
        public void calculateFine(ParkedCar car) {

            
        }
        
        
    }


