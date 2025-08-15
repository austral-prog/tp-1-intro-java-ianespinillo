package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a+b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        return number%2==0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a>b) {
            return a;
        }
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int total =1;
        for(int i=n; i>=1;i--){
            total *= i;

        }
        return total;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String reversed="";
        for(int i=input.length()-1; i>=0;i--){
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        if(number%2!=0 && number%3!=0){
            return true;
        }
        return false;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min=array[0];
        // TODO: Implement this method
        for(int i=1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
                break;
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int total = 0;
        for(int i=0; i<array.length; i++){
            total+= array[i];
        }
        return total;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return (celsius*1.8)+32;
    }
}
