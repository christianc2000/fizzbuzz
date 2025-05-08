package com.fizzbuzz;

public class Fizzbuzz {

    public String isMultiple(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }

    public void print(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(isMultiple(i));
        }
    }

    public static void main(String[] args) {
        new Fizzbuzz().print(1, 100);
    }
}
