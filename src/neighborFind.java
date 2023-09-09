import java.util.Scanner;

public class neighborFind {
    static String userNum = "";
    static int i = 0;
    static String back = "";
    public static void main(String[] args){
        Scanner address = new Scanner(System.in);
        System.out.println("Please enter your address number for your immediate neighbors! ");
        String userAdd = address.nextLine();
        int save = 0;

        for (int i = 0; i < userAdd.length(); i++){
            if (userAdd.charAt(i) == ' '){
                save = i;
                break;
            }
            userNum += userAdd.charAt(i);




        }
        for (int i = save + 1; i < userAdd.length(); i++){
            back += userAdd.charAt(i);

        }

        int plusTwo = Integer.parseInt(userNum) + 2;
        int minusTwo = Integer.parseInt(userNum) - 2;

        if (minusTwo < 0) {
            minusTwo += plusTwo * 2;
        }




        System.out.println("Your Address: " + userNum + " " + back);
        System.out.println("Your Neighbor's Address: " + plusTwo + " " + back);
        System.out.println("Your Neighbor's Address: " + minusTwo + " " + back);
    }
}
