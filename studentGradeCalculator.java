import java.util.InputMismatchException;
import java.util.Scanner;

public class studentGradeCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter No. of subjects: ");
            int n = sc.nextInt();

            int Marks[] = new int[n];     //for storing Number of each subject
            int sum = 0;
            float average = 0;          //we can use here float for more precise values but in result only 2 decimal points are shown(real)

            try {
                System.out.println("Enter marks in each subject out of 100 : ");
                for (int i = 0; i < n; i++) {
                    Marks[i] = sc.nextInt();
                    if (Marks[i] > 100) {
                        System.out.println("***** Marks should be less than or equal to 100 **** \nRe-enter your marks :");
                        i--; // Re-enter marks for the same subject
                    } else {
                        sum += Marks[i];
                    }
                }
                average = (float) sum / n;

            } catch (InputMismatchException ex) {
                System.out.println("Invalid marks || MARKS SHOULD BE INTEGERS || ");
                System.exit(0);
            }
            System.out.println("=========================================");
            System.out.println("Total marks obtained : " + sum+ "/"+100*n);
            System.out.println("Your percentage : " + average);
            System.out.print("Grade : ");

            if (average >= 90) {
                System.out.println("A+");
            } else if (average >= 80) {
                System.out.println("A");
            } else if (average >= 70) {
                System.out.println("B+");
            } else if (average >= 60) {
                System.out.println("B");
            } else if (average >= 50) {
                System.out.println("C+");
            } else if (average >= 40) {
                System.out.println("C");
            } else if (average >= 30) {
                System.out.println("D");
            } else if (average >= 0) {
                System.out.println("Failed");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("=========================================");
        }
}
