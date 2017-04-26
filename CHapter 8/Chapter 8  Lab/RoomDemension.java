public class RoomDimension
{
 //Initilazation
 private static double width;
 private static double length;
 
 //constructors
 public RoomDimension(double width, double length){
 
 this.width = width;
 this.length = length;
 
 
 }
 
 public RoomDimension(RoomDimension rd){
 
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
 public static double getArea(){
   double area = length * width;
   
   return area;
   
   }
   
  public String toString() {
	return "";
}
  

  

}
