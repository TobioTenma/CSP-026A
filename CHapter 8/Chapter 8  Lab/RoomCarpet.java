public class RoomCarpet
{

private double Carpetcost;
private double size;


RoomDimension  dim = new RoomDimension (size);

 
 public RoomCarpet(double dim, double cost)
 {
 
        this.roomDimensions = dim;
        this.costOfCarpet = costOfCarpet;
 }
 
  
  public RoomDemension(RoomCarpet rd)
  {
 
      this.dim = rd.getdim();
 
      this.cost = rd.getcost();
 
 }

   //This gets the total cost
   public double getTotalCost()
   {
    return Carpetcost * RoomDimension.getArea();
   }
   
   public static double getCarpetCost()
   {
		return carpetCost;
	}




}
