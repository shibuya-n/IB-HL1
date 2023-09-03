import java.util.*;

public class user_input {
    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Insert number: ");
        int userNumber = scannerObj.nextInt();

        scannerObj = new Scanner(System.in);

        System.out.println("Insert a word: ");
        String userWord = scannerObj.nextLine();

        System.out.println("User's Number: " + userNumber);
        System.out.println("User's Word: " + userWord);

    }
}
