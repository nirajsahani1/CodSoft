import java.util.Scanner;

class ATM {
     int PIN=7827;            //user pin
     public void checkPin(){
         System.out.println("Enter your pin:");
         Scanner sc = new Scanner(System.in);
         int enterPin =sc.nextInt();
         if(enterPin ==PIN){
             userBankAccount user=new userBankAccount();
             user.menu();
         }
         else {
             System.out.println("Enter a valid pin");
             checkPin();
         }
     }
}
class userBankAccount{            //user's bank account
     float Balance;
     public void menu(){
         System.out.println("Enter you Choices :");
         System.out.println("1. Check A/c balance:");
         System.out.println("2  Withdraw Money:");
         System.out.println("3. Deposit Money:");
         System.out.println("4. EXIT");

         Scanner sc = new Scanner(System.in);
         int opt=sc.nextInt();
         if(opt==1){
             checkBalance();
         }
         else if(opt==2){
             withdrawMoney();
         }
         else if( opt ==3){
             depositMoney();
         }
         else if(opt==4){
             return;
         }
         else {
             System.out.println("Enter a valid choice");
         }
     }

     public void checkBalance(){
         System.out.println("Balance: "+Balance);
         menu();
     }

     public void withdrawMoney(){
         System.out.println("Enter Amount to withdraw: ");
         Scanner sc = new Scanner(System.in);
         Float  amount =sc.nextFloat();
         if(amount>Balance){
             System.out.println("Insufficient Balance\n");
         }
         else {
             Balance=Balance-amount;
             System.out.println("Money withdraw successful\n");
         }
         menu();
     }
     public void depositMoney(){
         System.out.println("Enter the amount");
         Scanner sc = new Scanner(System.in);
         Float  amount =sc.nextFloat();
         Balance = Balance+amount;
         System.out.println("Money deposited successfully\n");
        menu();
     }
}

public class atmMachine{
    public static void main(String [] args){
        ATM obj = new ATM();
        obj.checkPin();
    }
}
