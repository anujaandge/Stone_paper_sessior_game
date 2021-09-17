import java.lang.Math; 
import java.util.Scanner;
public class Stone_paper_sessior {
    public static void main(String[] args){
        int min=1;
        int max=3;
        System.out.println("---------Lets do fun---------");
        System.out.println("Choose one from the following:\nPaper\nstone\nsessior");
        
        int c=(int)(Math.random()*(max-min+1)+min) ;
        
        System.out.println("Computer made its choice");
        String result="";
        switch(c){
            case 1 :
                result="paper";
                break;
            case 2:
                result="stone";
                break; 
            case 3:
                result="sessior";
                break;
        }
        
        System.out.println("Now its your turn:");
        Scanner sc = new Scanner(System.in);
        String choice=sc.next();
        
   
        if (result.equals(choice)){
            System.out.println("Draw because you both choose the same:"+choice);
        }
        else if (result.equals("paper") && choice.equals("stone")){
            System.out.println("computer wins ");
            System.out.println("choice of computer was:"+result);
        }
        else if (result.equals("paper") && choice.equals("sessior")){
            System.out.println("You wins");
            System.out.println("choice of computer was:"+result);
        }
        else if (result.equals("sessior") && choice.equals("stone")){
            System.out.println("you Wins");
            System.out.println("choice of computer was:"+result);
        }
        else if (result.equals("sessior") && choice.equals("paper")){
            System.out.println("computer wins");
            System.out.println("choice of computer was:"+result);
        }
        else if (result.equals("stone") && choice.equals("paper")){
            System.out.println("you wins");
            System.out.println("choice of computer was:"+result);
        }
        else if (result.equals("stone") && choice.equals("sessior")){
            System.out.println("computer wins");
            System.out.println("choice of computer was:"+result);
        }
        else{
            System.out.println("There is technical problem");
            System.out.println(result);
        }

    }
    
}
