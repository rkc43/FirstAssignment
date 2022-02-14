import java.util.Scanner;

public class First_Main {
Scanner sc = new Scanner(System.in);
    //function to checkPalindrome
       public void checkPalindrome()  {
            System.out.println("Enter A Number To Check If Palidrome of not");
            int num=sc.nextInt();
            int temp=0,tempNum=num,rem;
            while(num > 0){
                rem=num%10;
                temp=temp*10+rem;
                num=num/10;
            }
            if(tempNum == temp)
                System.out.println(tempNum + " is Palindrome");
            else
                System.out.println(tempNum + " is not a Palindrome");
      }

    //function to printPattern
       public void printPattern() {
        System.out.println("Enter A Number");
        int number=sc.nextInt();
        while(number >= 1){
        for(int i=number; i>0 ; i--){
            System.out.print("*");
        }
        System.out.println();
        number--;
        }
      }

    //function to check no is prime or not
        public void checkPrimeNumber() {
            System.out.println("Enter A Number To Check If Prime of not");
            int number=sc.nextInt();
            boolean Even=true;
            for(int i=2;i<number;i++){
                if(number%i == 0){
                    System.out.println(number+ " Is Not Prime");
                    Even=false;
                    break;
                }
            }
            if(Even){
                System.out.println(number+ " Is Prime");
            }
        }

    // function to print Fibonacci Series
        public void printFibonacciSeries() {
                //initialize the first and second value as 0,1 respectively.
          // int first = 0, second = 1;
            int first=0,second=1,sum;
            System.out.println("Enter A Number");
            int number=sc.nextInt();
            System.out.print(first+" "+second+" ");
            for(int i=2;i<number;i++){

                sum=first+second;
                System.out.print(sum+" ");
                first=second;
                second=sum;
            }
        }
 
      public static void main(String[] args) {
        First_Main obj = new First_Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            System.out.println();

            choice = sc.nextInt();
            switch (choice) {
            case 0:
                choice = 0;
            break;
            case 1: {
                obj.checkPalindrome();

            }
            break;
            case 2: {
                obj.printPattern();
            }
            break;
            case 3: {
                obj.checkPrimeNumber();
            }
            break;
            case 4: {
                obj.printFibonacciSeries();

            }
            break;
            default:
                System.out.println("Invalid choice. Enter a valid no.\n");
        }
        } while (choice != 0);
            System.out.println("Exited Successfully!!!");
            sc.close();
        }

 

}