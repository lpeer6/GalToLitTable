/*
    Try this 1-2
    This program displays a convesion 
    table of gallons to liters. 
    Call this program "GalToLitTable.java".
*/
package galtolittable;

/**
 *
 * @author Lorien
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        
        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854; //convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
        counter++;
        //every 10th line, print a blank line
        if(counter == 10) {
            System.out.println();
            counter = 0; //reset the counter
        }
        }
        
        
    }
    
}
