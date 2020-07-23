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
public class Registration 
{   
        private static int count = 1001;
        private int regNo;
        private Owner owner;
        private Cars car;
        
    public Registration(Owner owner, Cars car)
    {
        this.owner = owner;
        this.car = car;
        this.regNo = count;
        count++;
    }

    public static int getCount() {
        return count;
    }

   
    
      public String toString() {
        return String.format("%-10d %s %s",regNo,owner.toString(),car.toString());
    }
    
   
    
}
 