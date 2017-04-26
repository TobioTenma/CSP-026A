public class RoomCarpet
{

private double Carpetcost;
private double size;


RoomDemension dim = new RoomDemension(size);

 
 public RoomCarpet(double dim, double cost){
 
 
 }
 
  public RoomDemension(RoomCarpet rd){
 
this.dim = rd.getdim();
 
this.cost = rd.getcost();
 
 }




}
