import java.util.Scanner;

public class evenLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number of repetitions: ");
        int x = input.nextInt();

        for (int j = x; j >= 1; j--) {
            if (j % 2 == 0) {
                System.out.println(j);
            }

        }
    }
}
