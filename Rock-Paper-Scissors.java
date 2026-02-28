import java.util.Scanner;
import java.util.Random;
//importing java classes

public class game_1
{
    
    public static void main(String agrs[])
    {
        
        String options [] ={"Rock","Paper","Scissors"};
        //setting options
        
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        
        System.out.println("Enter one of these: Rock , Paper or Scissors");
        String userMove = sc.nextLine();
        //Taking Inputs from the User
        
        int complndex = ra.nextInt();
        String compMove = options[complndex];
        //Random Choice from Computer
        System.out.println("Computer choose:"+compMove);
        
        if(userMove.equalsIgnoreCase(compMove))
        {
            System.out.println("its a tie");
        }
        
        else if(
                 (userMove.equalsIgnoreCase("Rock")&&compMove.equals("Scissors"))  ||
                 (userMove.equalsIgnoreCase("Paper")&&compMove.equals("Rock"))     ||
                 (userMove.equalsIgnoreCase("Scissors")&&compMove.equals("Paper"))
               )
        {
            System.out.println("YOU WIN!");
        } 
        
        else
        {
            System.out.println("Opps , YOU LOSE");
        }
    }
}
Comment
