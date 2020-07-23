/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author Gan Hao Xian
 */
import java.util.Scanner;
public class Test 
{
      public static void main(String[] args) {
        
          cartype[] ct = { new cartype("Toyota","Vios",1.5), new cartype("Honda","Civic",1.6),new cartype("Nissan","Teana",2.0)};
          
          Registration[] reg = new Registration[6];
          
          Scanner scanner = new Scanner(System.in);
          
          for (int i =0; i < reg.length; ++i)
          {
              System.out.println("\nRegistration number : "+ Registration.getCount());
              System.out.println("Enter the owner name : ");
              String name = scanner.nextLine();
              System.out.println("Enter the IC Number : ");
              String icNo = scanner.nextLine();
              
              Owner owner = new Owner(name,icNo);
              
              System.out.println("Enter the plate No. : ");
              String plateNo = scanner.nextLine();
              System.out.println("Enter the color : ");
              String color = scanner.nextLine();
              System.out.println("Enter the Year : ");
              int year = scanner.nextInt ();
              
              System.out.println("Car types : ");
              for(int c = 0; c < ct.length;c++)
              {
                  System.out.println((c+1)+"\t"+ ct[c].toString());
              }
              System.out.println("\nSelect car type {1.."+ ct.length + "} :");
              int selection = scanner.nextInt();
              
              Cars car = new Cars (plateNo, color, year,ct[selection-1]);
              
              reg[i]= new Registration(owner,car);
              
              scanner.nextLine();
              
          }
    
          displayListing(reg);
            
      } 
      
        
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}
