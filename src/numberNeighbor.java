import java.util.*;

//Create a program that will find ten local number neighbors from a user inputted phone number
//A number neighbor is someone who has the same (cell) phone number as you, except the last digit is one lower or higher.
public class numberNeighbor {

    public static int position = 0;
    public static String lastFour = "";
    public static int four; 
    public static void main (String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("give me your phone number in this form. (xxx)xxx-xxxx");
        String input = numberInput.nextLine().strip();
        input = input.replaceAll("\\s", "");

        int inLength = input.length()-1;

        for (int i = inLength; i >= 0; i--){
            String x = input.substring(i, i+1);

            if (x.equals("-")){
                position = i;
                break;
            }
        }
        for (int i = position + 1; i <= input.length()-1; i++){
            lastFour += input.charAt(i);
            
        }
        
        for (int i = 1; i <= 10; i++) {
            four = Integer.parseInt(lastFour); 
            four += 1; 
        }
        System.out.println(four); 


    }
}
