import java.util.Scanner;

public class caladd {
    public static void main(String args[]) {
        float a,b,res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("1. Add Two Numbers\n");
            System.out.print("2. Multiply Two Numbers\n");
            System.out.print("3. Divide Two Numbers\n");
            System.out.print("4. Exit\n\n");
            System.out.print("Enter your Choice: ");
            choice = scan.next().charAt(0);
            switch(choice) {
                case '1': System.out.print("Enter Two Numbers: ");
                          a = scan.nextFloat();
                          b = scan.nextFloat();
                          res = a+b;
                          System.out.print("Result = " + res);
                          break;

                case '2': System.out.print("Enter Two Numbers: ");
                          a = scan.nextFloat();
                          b = scan.nextFloat();
                          res = a*b;
                          System.out.print("Result = " + res);
                          break;

                case '3': System.out.print("Enter Two Numbers: ");
                          a = scan.nextFloat();
                          b = scan.nextFloat();
                          res = a/b;
                          System.out.print("Result = " + res);
                          break;

                case '4': System.exit(0);
                          break;
                          
                default: System.out.print("INVALID CHOICE!");
            }
            System.out.print("\n------------------");
        }
        while (choice != '2');
    }
}