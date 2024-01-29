package org.example;

public class PrintWords {

    public static String getFizzBuzz(int number) {
        StringBuilder output = new StringBuilder();

        if (number <= 0 || number > 100) {
            throw new IllegalArgumentException("Number cannot be less than 1 and greater than 100");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    output.append("FizzBuzz\n");
                } else if (i % 5 == 0) {
                    output.append("Buzz\n");
                } else if (i % 3 == 0) {
                    output.append("Fizz\n");
                } else {
                    output.append(i).append("\n");
                }
            }
        }
        return output.toString();
    }
  /*  Write a program that prints the string representation of numbers from 1 to n
        - if the number is divisible by 3, print "Fizz"
        - if the number is divisible by 5, print "Buzz"
        - if the number is divisible by 3 and 5, print "FizzBuzz"
        - in other cases, print the number itself
        1 <= n <= 100
   */

}

