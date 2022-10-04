package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum = (a + b + c + (int) d + (int) e + (int) f + (int) g + (int) h);

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);

        int number1;
        int number2;

        number1 = scan.nextInt();
        number2 = scan.nextInt();

        int sum = (number1 + number2);

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Before Swap:");

        n1 = scan.nextInt();
        n2 = scan.nextInt();

        System.out.println("x: y: After Swap:");
        System.out.println("x: " + n2);
        System.out.println("y: " + n1);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);

        int n1, n2;

        n1 = scan.nextInt();
        n2 = scan.nextInt();

        if (n1>n2) {
            System.out.println("n1: "+"n2: "+"n1 > n2");

        }

        if (n2>n1) {
            System.out.println("n1: "+"n2: "+"n2 > n1");

        }

        if (n1==n2) {
            System.out.println("n1: "+"n2: "+"n1 == n2");

        }


    }

    //todo Task 7
    public void ratingSalesPerson(){

        Scanner scan = new Scanner(System.in);

        int x;

        //System.out.println("Enter annual Revenue: ");
        x = scan.nextInt();

        if (x<0 || x>=100000) {
            System.out.println("Enter annual Revenue: Invalid Revenue");

        } else if (x<20000) {
            System.out.println("Enter annual Revenue: Poor Sales Revenue");
            
        } else if (x<50000) {
            System.out.println("Enter annual Revenue: Average Sales Revenue");

        } else if (x<80000) {
            System.out.println("Enter annual Revenue: Good Sales Revenue");
        }
        else
            System.out.println("Enter annual Revenue: Excellent Sales Revenue");

    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner scan = new Scanner(System.in);
        int commission = scan.nextInt();

        switch (commission){
            case 0:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.0");
                break;
            case 1:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.04");
        }
    }

    //todo Task 9
    public void leapyear(){

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        if (x % 4 == 0 && x % 400 == 0) {
            System.out.println("Year: "+"Leapyear");
        }
        else System.out.println("Year: "+"Not a Leapyear");

    }

    //todo Task 10
    public void transposedNumbers(){

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int reverse = 0;

        while (x!=0 && x<=999){
            reverse = reverse*10 + x%10;
            x=x/10;
        }
        System.out.println("Number: " + reverse);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}