/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrar;

/**
 *
 * @author Rejoice Barka
 */
public class Arrar {
    int marks[]; //line 1
    
    public void storeMarks() {
    marks = new int[4]; // line2
    System.out.println("Storing Marks. Please wait...");
    
    marks[0] = 65; //line 3
    marks[1] = 47;
    marks[2] = 75; 
    marks[3] = 50; 
    }
    
    public void dispalyMarks() {
    System.out.println("Marks are:");
    
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    /**
     * @param args the command line arguments
     */
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Arrar oneDimensionObj = new Arrar();
        oneDimensionObj.storeMarks();
        oneDimensionObj.displayMarks();
       
    }
    
}
