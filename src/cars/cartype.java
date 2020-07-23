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
public class cartype
{
    private String make;
    private String model;
    private double capacity;
    public cartype(String make, String model,double capacity)
    {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
                
    }
    
     public String toString() {
        return String.format("%-10s %-10s %-10.1f",make,model,capacity);
    }
}
