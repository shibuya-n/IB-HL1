import java.util.*;

//Create a program that will find ten local number neighbors from a user inputted phone number
//A number neighbor is someone who has the same (cell) phone number as you, except the last digit is one lower or higher.
public class numberNeighbor {

    public static int position = 0;
    public static String lastFour = "";
    public static int fourNumber = 0; 
    
    public static void main (String[] args) {

        ArrayList<String> numbers = new ArrayList<String>(); 

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
        int last = Integer.parseInt(lastFour.substring(lastFour.length()-1)); 
        int forwardsNumber = Integer.parseInt(lastFour); 
        int backwardsNumber = Integer.parseInt(lastFour); 
        System.out.println(last);
        int back = last; 
        int forwards = 10 - last;

        for (int i = 0; i < forwards; i++) {
            forwardsNumber++; 
            System.out.println(forwardsNumber); 
        }
        for (int i = last; i > 0; i--){
            backwardsNumber--; 
            System.out.println(backwardsNumber);
        }
        
        


    }
}
