import java.util.Scanner;

public class compareLength {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert something to compare: ");
        String input = userInput.nextLine().strip();
        int length = input.length();


        userInput = new Scanner(System.in);
        System.out.println("Insert a second thing to compare: ");
        String input2 = userInput.nextLine().strip();
        int length2 = input2.length();

        if (length == length2) {
            System.out.println("Yay2");
        }
        else {
            System.out.println("Not Yay2");
        }
    }
}
