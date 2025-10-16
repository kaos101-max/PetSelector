//Name: Diauske Watanabe
import java.util.*;
public class PetSelector{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (Idiot proof!)
        //make a deceision, tell the user what they get!
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter your favorite color (Either red, blue, or green):");
        String colors = userInput.nextLine();

        System.out.println("Also, enter your favorite season (Either spring, summer, fall, or winter):");
        String season = userInput.nextLine();
        
        System.out.println ("Enter your name here:");
        String name;

        //Starter for a pet
        String pet = "Pet Rock";
        
        if (colors.equals("red") && season.equals("winter")){
            pet = "panda";
        }
        if (colors.equals("blue") && season.equals("fall")){
            pet = "alligator";
        }
        if (colors.equals("green") && season.equals("winter")){
            pet = "giraffe";
        }
            
        
        }
        
        
        
        //if ("abcdefghijklmnopqurstuvwxyz".indexOf(colors.substring(i,i+1).toLowercase()) >= 0)
        //{
            //System.out.println("Enter your favorite season (winter, spring, summer, fall):");
            //season = userInput.nextLine();
        //}
        //else 
        //{
            //System.out.println("Error, please try again!");
        //}
}
