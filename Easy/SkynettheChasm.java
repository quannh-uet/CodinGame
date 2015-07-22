import java.util.*;
import java.io.*;
import java.math.*;
/**
 * SkynettheChasm class.
 * @author quannh
 **/
class SkynettheChasm {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt();
            int coordX = in.nextInt();

            // System.err.println(road);

            if(coordX == road - 1)
                System.out.println("JUMP");
            else if(coordX > road - 1)
                System.out.println("SLOW");
            else if(speed == gap + 1)
                System.out.println("WAIT");
            else if(speed > gap + 1)
                System.out.println("SLOW");
            else
                System.out.println("SPEED");
        }
    }
}
