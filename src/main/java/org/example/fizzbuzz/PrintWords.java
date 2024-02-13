package org.example.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class PrintWords {

    public static String getFizzBuzz(int number) {
        StringBuilder output = new StringBuilder();

        if (number <= 1 || number > 100) {
            throw new IllegalArgumentException("Number cannot be less than 1 and greater than 100");
        }

        Map<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");

        for (int i = 1; i <= number; i++) {
            StringBuilder currentOutput = new StringBuilder();
            for (Map.Entry<Integer, String> entry : rules.entrySet()) {
                if (i % entry.getKey() == 0) {
                    currentOutput.append(entry.getValue());
                }
            }
            if (currentOutput.isEmpty()) {
                currentOutput.append(i);
            }

            output.append(currentOutput).append("\n");
        }

        return output.toString();
    }


}

    /*  Write a program that prints the string representation of numbers from 1 to n
          - if the number is divisible by 3, print "Fizz"
          - if the number is divisible by 5, print "Buzz"
          - if the number is divisible by 3 and 5, print "FizzBuzz"
          - in other cases, print the number itself
          1 <= n <= 100
     */



