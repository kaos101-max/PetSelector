//Project: Perfect Pet Selector
//Name: Daisuke Watanabe
//Date: 10/16/25
//Description: This program matches people's pet they select by depending on their favorite color, season, and if their name starts with(out) vowels.
import java.util.*;
public class PetSelector{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (Idiot proof!)
        //make a deceision, tell the user what they get!
        Scanner userInput = new Scanner (System.in);
        System.out.println("First, enter your favorite color (Either red, blue, or green):");
        String colors = userInput.nextLine().toLowerCase().trim();

        System.out.println("Second, enter your favorite season (Either spring, summer, fall, or winter):");
        String season = userInput.nextLine().toLowerCase().trim();
        
        System.out.println ("Finally, enter your name here:");
        String name = userInput.nextLine().toLowerCase().trim();
        boolean startsWithVowel = "aeiou".indexOf(name.substring(0,1))>=0;

        //Starter for a pet
        String pet = "Pet Rock";
        
        if (colors.equals("blue") && season.equals("fall")){
            pet = "alligator";
        }
        else if (colors.equals("blue") && season.equals("spring")){
            pet = "ostrich";
        }
        else if (colors.equals("green") && season.equals("winter") && !startsWithVowel){
            pet = "giraffe";
        }
        else if (colors.equals("green") && !season.equals("fall")){
            pet = "dog";
        }
        else if (colors.equals("green") && season.equals("summer") && !startsWithVowel){
            pet = "dog";
        }
        else if (colors.equals("red") && season.equals("winter") && !startsWithVowel){
            pet = "panda";
        }
        else if (colors.equals("red") && season.equals("winter")){
            pet = "porcupine";
        }
        else if (colors.equals("blue") && season.equals("summer")){
            pet = "pony";
        }
        else if (colors.equals("blue") && season.equals("winter") && !startsWithVowel){
            pet = "axolotl";
        }
        else if (colors.equals("blue") && season.equals("winter")){
            pet = "rock";
        }
        
        //Result of your selected pet.
        System.out.println("Your perfect pet is: " + pet);
        }
        
}
