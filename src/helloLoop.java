import java.util.Scanner;

public class helloLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number of repetitions: ");
        int x = input.nextInt();

        for (int j = x; j >= 1; j--) {
            System.out.println("hello");
        }
    }
}
