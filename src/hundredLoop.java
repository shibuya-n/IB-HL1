import java.util.*;
public class hundredLoop {
    public static void main(String[] args) {
        //Create a program that will loop while a summed value is less than 100. Have the program prompt the user for a number to add to the sum at every loop. Output the sum each loop.
        //If the last iteration is equal to or over 100, output that sum before ending the loop.

        int x = 0;
        while (x < 100) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input number to add: ");
            int inputNum = input.nextInt();
            System.out.println();
            x += inputNum;
            System.out.println(x);
            if (x >= 100) {
                System.out.println();
                System.out.println("Final Sum: " + x);
                break;
            }
        }
    }
}
