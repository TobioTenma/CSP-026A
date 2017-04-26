public class RoomCarpet
{

private static double Carpetcost;
private RoomDimension size;




 
 public RoomCarpet(RoomDimension dim, double cost)
 {
 
        this.size = dim;
        this.Carpetcost= cost;
 }
 
  
  public RoomCarpet(RoomCarpet rd)
  {
 
      this.size = rd.size;
 
      this.Carpetcost = rd.Carpetcost;
 
 }

   //This gets the total cost
   public double getTotalCost()
   {
    return Carpetcost * RoomDimension.getArea();
   }
   //gets carpetcost
   public static double getCarpetCost()
   {
		return Carpetcost;
	}

    public String toString() {
        return "RoomCarpet is " + size + ", The cost of the carpet is " + Carpetcost + ", " + " the total cost is " + getTotalCost() + "]";
    }


}
