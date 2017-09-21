
package prices;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class Prices {

    public static void main(String[] args) {
        
        /*
          This program has a 2D Array to represent prices and discounts.
          User will be prompted to enter 5 price values in which a 
          calculate discount corresponding to the user's input value
          will be stored along with the corresponding price value.
          ie. at 2-D array at index [0][0] price1, at index [0][1] price1 discount
        */

        double [][] prices = new double [5][2];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            
            System.out.println("Enter the original price: ");
            
            prices [i][0] = in.nextDouble();
            prices [i][1] += prices [i][0] * .70;
            
        }
        
        for(int i = 0; i < 5; i++){
            
            System.out.println("original price is $" + prices [i][0] +
                    "\t the discounted prices is $" + prices [i][1]);
        }
        
    }
    
}
