import java.util.*;

public class stringCompare {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert something to compare: ");
        String input = userInput.nextLine().strip();

        userInput = new Scanner(System.in);
        System.out.println("Insert a second thing to compare: ");
        String input2 = userInput.nextLine().strip();

        if (input.equals(input2)) {
            System.out.println("Yay");
        }
        else {
            System.out.println("Not Yay");
        }
    }
}
