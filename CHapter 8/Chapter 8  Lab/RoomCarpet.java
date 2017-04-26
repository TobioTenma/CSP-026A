public class RoomCarpet
{

private double Carpetcost;
private double size;


RoomDimension  dim = new RoomDimension (size);

 
 public RoomCarpet(RoomDimension dim, double cost)
 {
 
        this.roomDimensions = dim;
        this.costOfCarpet = costOfCarpet;
 }
 
  
  public RoomDimension(RoomCarpet rd)
  {
 
      this.dim = rd.getdim();
 
      this.cost = rd.getcost();
 
 }

   //This gets the total cost
   public double getTotalCost()
   {
    return Carpetcost * RoomDimension.getArea();
   }
   //gets carpetcost
   public static double getCarpetCost()
   {
		return carpetCost;
	}

    public String toString() {
        return "RoomCarpet is " + roomDimensions + ", costOfCarpet=" + costOfCarpet + ", " + "total cost=" + getTotalCost() + "]";
    }


}
