import java.util.Scanner;

public class carpetDemo
{

     public static void main(String[] args)
     {
     
     
     
     // Scanner class
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("What is the length if the room? ");
     double length = scanner.nextDouble();
     
     System.out.print("What is the width if the room? ");
     double width = scanner.nextDouble();
     
     System.out.print("What is the cost of the floor ");
     double cost = scanner.nextDouble();
     
      //transfers information
      RoomDimension dimStuff = new RoomDimension(length,width);
      RoomCarpet roomStuff = new RoomCarpet(dimStuff, cost);
      
      
      System.out.println(roomStuff);
    
   
     }
}
