package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double ans1;
        double ans2;
        String op1;
        int op2;
        String userOperator;
        String noun;
        String satisfaction;
        String method;

        System.out.println("Select an operator:(add, subtract, multiply divide)");
        op1 = kb.next();

        System.out.println("Enter two numbers:(Ex: 13 904)");
        int int1 = kb.nextInt();
        int int2 = kb.nextInt();

        switch (op1) {
            case "add":
                ans1 = int1 + int2;
                noun = "sum";
                break;
            case "subtract":
                ans1 = int1 - int2;
                noun = "difference";
                break;
            case "multiply":
                ans1 = int1 * int2;
                noun = "product";
                break;
            case "divide":
                ans1 = int1 / int2;
                noun = "quotient";
                break;
            default:
                ans1 = 9;
                noun = "sum";
        }

        op2 = (int) (Math.random() * 6);

        switch (op2) {
            case 0:
                ans2 = Math.sqrt(ans1);
                userOperator = "sqrt";
                break;
            case 1:
                ans2 = Math.sin(ans1);
                userOperator = "sin";
                break;
            case 2:
                ans2 = Math.cos(ans1);
                userOperator = "cos";
                break;
            case 3:
                ans2 = Math.log(ans1);
                userOperator = "log";
                break;
            case 4:
                ans2 = Math.exp(ans1);
                userOperator = "exp";
                break;
            case 5:
                ans2 = Math.random();
                userOperator = "random";
                break;
            default:
                ans2 = 5;
                userOperator = "5";
                break;
        }

        System.out.println("The " + noun + " of " + int1 + " and " + int2 + " is " + ans2 + ". Are you satisfied?");
        satisfaction = kb.next();

        switch (satisfaction) {
            case "yes":
                System.out.println("You have been misinformed, I used the " + userOperator + " method after " + op1 + "ing your two numbers.");
                break;
            case "no":
                System.out.println("Can you identify the math class method I ran to the real answer?");
                method = kb.next();
                if(method.equalsIgnoreCase(userOperator)){
                    System.out.println("Great! Good job and goodbye!");
                }
                else System.out.println("That is incorrect, I used the " + userOperator + " method.");
                break;
            default:
                System.out.println("error: enter 'yes' or 'no'");
                break;
        }
    }
}
