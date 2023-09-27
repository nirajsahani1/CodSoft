import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static boolean userGuessingNumber(int random){
          Scanner sc =new Scanner(System.in);
          System.out.println("guess the number ");
          int User=sc.nextInt();

          //Conditions
        if(User>random){
            System.out.println("too high");
        }
        else if(User<random){
            System.out.println("Too low");
        }
        else if(User==random){
            System.out.println("=========================================");
            System.out.println("|| Your Guess is Correct = You win ||");
            System.out.println("=========================================");
            return true;
        }
        return false;
    }
    public static void startGame(int countRound){
        Scanner sc =new Scanner(System.in);
        int userWin=0;
        Random random=new Random();   //create instance of random calss

        int rndom= random.nextInt(101);    //range of random is 0 to 100  //     System.out.println("Number genereted by System is : "+rndom);
        System.out.println("You have Five change :-");
        int g=5,s=0,noOftime=0;
        while (g>0){
            noOftime++;
            boolean b= userGuessingNumber(rndom);
            if(b){
                break;                   //for breaking loop we used boolean
            }
            else {
                g--;
                if(g==0){
                    s=1;
                }
            }
        }
        if(s==1){
            System.out.println("|| Your Guess is Incorrect = You Lose ||");
        }

        System.out.println("=========================================");
        System.out.println("|| Number genereted by System is : "+rndom + "||");
        System.out.println("=========================================");
         if(s!=1){
             userWin=userWin+1;
            System.out.println("|| Number of Attempts taken by You : "+noOftime+" ||");
             System.out.println("=========================================");
        }
         int diff=countRound-userWin;
        System.out.println("Number of rounds : "+countRound+"\nNumber of round User Win : "+userWin+"\nNumber of round System win :"+diff);
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number Game ");
        System.out.println("Want to Play Game yes/no");
        String str=sc.next();
        str=str.toLowerCase(Locale.ROOT);
        boolean flag=true;
        int countRound=0;
        while (flag){
           switch (str){
            case "yes":
                  countRound++;
                  numberGame obj=new numberGame();
                  obj.startGame(countRound);
                  System.out.println("Play again yes/no");
                  String st=sc.next();
                  if(st.toLowerCase().equals("no")){
                      System.out.println("Exit Game");
                      flag=false;
                  }
                  break;
              default:
                  System.out.println("Exit Game,");
                  flag=false;
                  break;
            }
        }
    }
}

//Though Java doesn’t prefer main() method called from somewhere else in the program, it does not prohibit one
// from doing it as well. So, in fact, we can call the main() method whenever and wherever we need to.