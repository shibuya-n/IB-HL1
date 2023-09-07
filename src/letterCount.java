//Create a program that will loop through a user provided string and output the total number of vowels and consonants in the string
import java.util.*;

public class letterCount {
    public static void main(String[] args){

        int vowels = 0;
        int consonants = 0;

        ArrayList<String> x = new ArrayList<String>();
        x.add("a");
        x.add("e");
        x.add("i");
        x.add("o");
        x.add("u");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert something to compare: ");
        String input = userInput.nextLine().strip();
        input = input.replaceAll("\\s", "");
        for (int i = 0; i < input.length(); i++){
            boolean isVowel = false;
            String letter = input.substring(i, i+1);
            for(int j = 0; j < x.size(); j++){
                if(letter.equals(x.get(j))){
                    vowels++;
                    isVowel = true;
                }

                }
            if (!isVowel) {
                consonants++;
            }
            }

        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
            }

    }





