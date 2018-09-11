package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Scanner kb2 = new Scanner(System.in);
        Scanner kb3 = new Scanner(System.in);

        double ans1;
        double ans2;
        String op1;
        int op2;
        String operator;
        String noun;
        String satisfaction;

        System.out.println("Select an operator:(add, subtract, multiply divide)");
        op1 = kb.nextLine();

        System.out.println("enter two numbers:");
        int int1 = kb.nextInt();
        int int2 = kb.nextInt();

        switch (op1) {
            case "add" : ans1 = int1 + int2;
                        noun = "sum";
                        break;
            case "subtract" : ans1 = int1 - int2;
                        noun = "difference";
                        break;
            case "multiply" : ans1 = int1 * int2;
                        noun = "product";
                        break;
            case "divide" : ans1 = int1 / int2;
                        noun = "quotient";
                        break;
            default : ans1 = 5;
                        noun = "answer";
        }

        op2 = (int)(Math.random()*7);

                switch (op2){
                    case 0 : ans2 = Math.sqrt(ans1);
                        operator = "sqrt";
                    case 1 : ans2 = Math.sin(ans1);
                        operator = "sin";
                    case 2 : ans2 = Math.cos(ans1);
                        operator = "cos";
                    case 3 : ans2 = Math.log(ans1);
                        operator = "log";
                    case 4 : ans2 = Math.exp(ans1);
                        operator = "exp";
                    case 5 : ans2 = Math.random();
                        operator = "random";
                    case 6 : ans2 = (ans1 % 2);
                        operator = "modulus";
                    default: ans2 = 5;
        }

        System.out.println("The " + noun + " of " + int1 + " and " + int2 + " is " + ans2 + ". Are you satisfied?");
        satisfaction = kb.nextLine();







    }
}
