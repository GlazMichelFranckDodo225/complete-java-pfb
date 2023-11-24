package com.dgmf.bconditionalifelsestatement;

public class ConditionalIfElseStatement {
    public static void main(String[] args) {
        int num = 13;
        int num2 = 12;
        int num3 = 14;

        // If statement
        System.out.println("====== If statement ======");
        if(num > num2) {
            System.out.println("The number is greater than : " + num2);
        }

        if(num < num3) {
            System.out.println("The number is smaller than : " + num3);
        }

        // If...Else Statement
        System.out.println("====== If...Else Statement ======");
        if(num < num2) {
            System.out.println("The number is smaller than : " + num2);
        } else {
            System.out.println("The number is greater than : " + num2);
        }

        // If...If...Else Statement
        System.out.println("====== If...If...Else Statement ======");
        if(num < num2) {
            System.out.println("The number is smaller than : " + num2);
        } if(num > num3) {
            System.out.println("The number is greater than : " + num3);
        } else {
            System.out.println("The number is equal to " + num);
        }


    }
}
