import java.util.*;
import java.io.*;
import java.math.*;

/**
 * PowerofThor class.
 * @author quannh
 **/
class PowerofThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialX = in.nextInt(); // Thor's starting X position
        int initialY = in.nextInt(); // Thor's starting Y position
        int distanceX = lightX - initialX;
        int distanceY = lightY - initialY;
        in.nextLine();

        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            in.nextLine();

            if (distanceX > 0){
                if (distanceY > 0){
                    System.out.println("SE");
                    distanceX--;
                    distanceY--;
                } else if (distanceY < 0) {
                    System.out.println("NE");
                    distanceX--;
                    distanceY++;
                } else {
                    System.out.println("E");
                    distanceX--;
                }
                
            } else if (distanceX < 0) { // distanceX < 0
                if (distanceY > 0) {
                    System.out.println("SW");
                    distanceX++;
                    distanceY--;
                } else if (distanceY < 0) {
                    System.out.println("NW");
                    distanceX++;
                    distanceY++;
                } else {
                    System.out.println("W");
                    distanceX++;
                    
                }
            } else { // distanceX = 0
                if (distanceY > 0) {
                    System.out.println("S");
                    distanceY--;
                } else if (distanceY < 0) {
                    System.out.println("N");
                    distanceY++;
                }
            }
            
            
        }
    }
}