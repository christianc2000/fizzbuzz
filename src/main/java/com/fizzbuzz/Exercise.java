package com.fizzbuzz;

public class Exercise {
    public String isMultiplo(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }else if(num % 3 == 0){
            return "Fizz";
        }else if(num % 5 == 0){
            return "Buzz";
        }else{
            return String.valueOf(num);
        }
    }

    public void printMultiplo(int num){
        for(int i = 1; i <= num; i++){
            System.out.println(i+" -> "+isMultiplo(i));
        }
    }
}
