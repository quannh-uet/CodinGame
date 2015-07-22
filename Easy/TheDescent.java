import java.util.*;
import java.io.*;
import java.math.*;

/**
 * TheDescent class.
 * @author quannh
 **/
class TheDescent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int maxHeight = 0;
            int heightestIndex = 0;
        
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) {
                // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                int mountainH = in.nextInt(); 
                if (maxHeight <= mountainH) {
                    maxHeight = mountainH;
                    heightestIndex = i;
                }
            }

            // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
            if (spaceX == heightestIndex) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD");
            }
        }
    }
}