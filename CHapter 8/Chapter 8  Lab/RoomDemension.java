public class RoomDemension
{
 //Initilazation
 private double width;
 private double length;
 
 //constructors
 public RoomDemension(double width, double length){
 
 this.width = width;
 this.length = length;
 
 
 }
 
 public RoomDemension(RoomDemension rd){
 
 this.width = rd.getwidth();
 
 this.length = rd.getlength();
 
 }
 
 //Methods
 public double getwidth(){
 
  return width;
 
 }
 
 public double getlength(){
 
   return length;
 }
 
   //Get the area
 public double getArea(){
   double area = length * width;
   
   return area;
   
   }
   
  public String toString() {
	return "";
}
  

  

}
