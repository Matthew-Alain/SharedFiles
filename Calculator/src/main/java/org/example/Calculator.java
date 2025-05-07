package org.example;

import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    static Boolean done = false;
    static int num1, num2;
    static float value;

    public static void main(String[] var0) {

        greeting();

        do{
            value = 0;
            num1 = getNum1();
            num2 = getNum2();
            displayMenu();
            getOperation();
            goAgain();
        }while(!done);

        System.out.println("Thank you for using my calculator!");

    }

    public static void greeting(){
        System.out.println("Welcome to my calculator.");
        System.out.println("Input two numbers, then select your operation:");
    }

    public static int getNum1(){
        System.out.println("First number:");
        int num = input.nextInt();
        input.nextLine();
        return num;
    }

    public static int getNum2(){
        System.out.println("Second number:");
        int num = input.nextInt();
        input.nextLine();
        return num;
    }


    public static void displayMenu(){
        System.out.println("Please select your operation:\n" +
                "A for addition\n"+
                "S for subtraction\n"+
                "M for multiplication\n"+
                "D for division");
    }

    public static void getOperation(){
        Boolean error = false;
        String choice = input.nextLine();
        switch (choice) {
            case "A", "a":
                value = add(num1, num2);
                break;
            case "S", "s":
                value = sub(num1, num2);
                break;
            case "M", "m":
                value = mult(num1, num2);
                break;
            case "D", "d":
                value = div((float)num1, (float)num2);
                break;
            default:
                System.out.println("Error, try again.");
                error = true;
                getOperation();
        }
        if(!error){
            System.out.println("Value is: " + value);
        }
    }

    public static int add(int first, int second){
        return first + second;
    }

    public static int sub(int first, int second){
        return first - second;
    }

    public static int mult(int first, int second){
        return first * second;
    }

    public static float div(float first, float second){
        if(second == 0){
            System.out.println("Cannot divide by 0.");
            return 0;
        }else{
            return first / second;
        }
    }

    public static void goAgain(){
        System.out.println("Would you like to do another calculation? Y / N");
        String again = input.nextLine();
        if(again.equals("N") || again.equals("n")){
            done = true;
        }else if(!(again.equals("Y") || again.equals("y"))){
            System.out.println("Invalid entry.");
            goAgain();
        }
    }
}