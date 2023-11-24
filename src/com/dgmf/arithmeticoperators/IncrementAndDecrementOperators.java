package com.dgmf.arithmeticoperators;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        // Increment Operator
        int num = 18; // 18

        System.out.println("===== Increment Operator =====");
        System.out.println(num); // 18
        num = num + 1; // 19
        System.out.println(num); // 19
        num += 1; // 20
        System.out.println(num); // 20
        num++; // 21
        System.out.println(num); // 21
        ++num; // 22
        System.out.println(num); // 22
        
        // Decrement Operator
        int num2 = 50; // 50

        System.out.println("===== Decrement Operator =====");
        System.out.println(num2); // 50
        num2 = num2 - 1; // 49
        System.out.println(num2); // 49
        num2 -= 1; // 48
        System.out.println(num2); // 48
        num2--; // 47
        System.out.println(num2); // 47
        --num2; // 46
        System.out.println(num2); // 47
    }
}
