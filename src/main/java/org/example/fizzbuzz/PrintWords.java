package org.example.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class PrintWords {

    public static String getFizzBuzz(int number) {
        StringBuilder output = new StringBuilder();

        if (number <= 1 || number > 100) {
            throw new IllegalArgumentException("Number cannot be less than 1 and greater than 100");
        }

        List<PrintingRule> rules = new ArrayList<>();
        rules.add(new PrintingRule(3, "Fizz"));
        rules.add(new PrintingRule(5, "Buzz"));

        for (int i = 1; i <= number; i++) {
            StringBuilder currentOutput = new StringBuilder();
            for (PrintingRule rule : rules) {
                if (rule.isValid(i)) {
                    currentOutput.append(rule.getOutput());
                }
            }
            output.append(currentOutput.isEmpty() ? i : currentOutput).append("\n");
        }
        return output.toString();
    }


    private static class PrintingRule {

        private final int divisor;
        private final String output;

        PrintingRule(int divisor, String output) {
            this.divisor = divisor;
            this.output = output;
        }

        boolean isValid(int number) {
            return number % divisor == 0;
        }

        String getOutput() {
            return output;
        }

    }

    /*  Write a program that prints the string representation of numbers from 1 to n
          - if the number is divisible by 3, print "Fizz"
          - if the number is divisible by 5, print "Buzz"
          - if the number is divisible by 3 and 5, print "FizzBuzz"
          - in other cases, print the number itself
          1 <= n <= 100
     */

}

