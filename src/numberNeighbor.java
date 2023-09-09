import java.util.*;


//Create a program that will find ten local number neighbors from a user inputted phone number
//A number neighbor is someone who has the same (cell) phone number as you, except the last digit is one lower or higher.
public class numberNeighbor {

    public static int position = 0;
    public static String lastFour = "";
    public static String restNum = ""; 
    public static int fourNumber = 0; 
    
    public static void main (String[] args) {

        ArrayList<String> numbers = new ArrayList<String>(); 
        String num; 

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

       // splits the number into two  
       lastFour = input.substring(position+1); 
       restNum = input.substring(0, position+1); 
    
        

        // info for the for loops 
        int last = Integer.parseInt(lastFour.substring(lastFour.length()-1)); 
        int forwardsNumber = Integer.parseInt(lastFour); 
        int backwardsNumber = Integer.parseInt(lastFour); 
       
        int back = last; 
        int forwards = 10 - last;

        // finds the neighboring numbers and adds them to the arraylist 
        for (int i = 0; i < forwards; i++) {
            forwardsNumber++; 
            
            if (forwardsNumber == 10000){
                num = "0000"; 
                numbers.add(num); 
            }
            else {
                num = String.valueOf(forwardsNumber);
                numbers.add(String.valueOf(num)); 
                System.out.println(num); 
            }
            
        }
        for (int i = back; i > 0; i--){
            backwardsNumber--; 

            num = String.valueOf(backwardsNumber);
            numbers.add(String.valueOf(num)); 
        }
        
        // takes the numbers out from the arraylist and concats. with the rest of the numbers 

        for (int i = 0; i < numbers.size(); i++){
            String x = numbers.get(i); 
            if (x.length() == 4 ) {
                System.out.println(restNum + x);
            }
            else {
                for(int j = 0; j <= 4 - x.length(); j++){
                     
                    x = "0" + x; 
                    System.out.println(x);
                }
                System.out.println(x);
            }
        }


    }
}
