import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Onboarding class.
 * @author quannh
 **/
class Onboarding {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            System.err.println("Distance " + enemy1 + dist1);
            System.err.println("Distance " + enemy2 + dist2);
            
            // You have to output a correct ship name to shoot ("Buzz", enemy1, enemy2, ...)
            if (dist2 == 0) {
                System.out.println(enemy1);
            }
            if (dist1 <= dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }
        }
    }
}