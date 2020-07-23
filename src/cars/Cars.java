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
public class Cars {

    private String plateNo;
    private String color;
    private int year;
    private cartype type;
  

    
    public Cars(String plateNo,String color,int year,cartype type)
    {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.type = type;
    }
     public String toString() {
        return String.format("%-10s %-10s %-8d %s",plateNo,color,year,type.toString());
    }
    
    
    
  
}
