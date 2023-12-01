package com.dgmf.subject3relationaloperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 12;

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        System.out.println("****** > (Greater than) ******");
        System.out.println("Num1 is greater than Num2 : " + (num1 > num2));

        System.out.println("****** < (Lesser than) ******");
        System.out.println("Num1 is lesser than Num2 : " + (num1 < num2));

        System.out.println("****** >= (Greater than or Equal to) ******");
        System.out.println("Num1 is greater than or Equal to Num2 : "
                + (num1 >= num2));

        System.out.println("****** <= (Lesser than or Equal to) ******");
        System.out.println("Num1 is lesser than or Equal to Num2 : "
                + (num1 <= num2));

        System.out.println("****** == (Equal to) ******");
        System.out.println("Num1 is equal to Num2 : "
                + (num1 == num2));

        System.out.println("****** != (Not Equal to) ******");
        System.out.println("Num1 is not equal to Num2 : "
                + (num1 != num2));
    }
}
