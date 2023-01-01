import java.util.Random;
import java.util.Scanner;

public class random_frm_system {
    public static void main(String[] args)
    {
        //o for Rock
        //1 for Paper
        //2 for Scissor
        System.out.println("Enter your choice  :");

        Scanner obj=new Scanner(System.in);

        int userInput=obj.nextInt();
        if( userInput>=4){
            System.out.println("<<<<< Invalid Choice >>>> ");
        }
        Random random=new Random();
        int computerInput=random.nextInt(3);
        if(userInput == computerInput)

        {
            System.out.println("Draw");
        }
        else if ( userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||  userInput == 2 && computerInput == 1)

        {
            System.out.println("You Win !........");
        }
        else if(userInput==0 && computerInput==1 || userInput==1 && computerInput==2 || userInput==2 && computerInput==0 )

        {
            System.out.println("Computer Win !........");
        }

      //System.out.println("Computer Choice :");
        if(computerInput==0){
            System.out.println("computer Choice : Rock");
        }
        else if (computerInput==1)
        {
            System.out.println("computer Choice : Paper");
        }
        else if  (computerInput==2)
        {
            System.out.println("computer Choice : Scissor");
        }

    }

}
