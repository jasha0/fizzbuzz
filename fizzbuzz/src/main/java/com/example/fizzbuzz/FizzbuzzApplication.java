package com.example.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
		int n = 100; // This variable determines the number of iterations for the loop.
		/*
		 * -Initialization (int i = 0): This part sets up the loop variable i and
		 * initializes it to 0. This variable will be used to control the loop.
		 * -Condition (i < n): This condition is checked before each iteration. The loop
		 * will continue to execute as long as i is less than n (which is 100 in this
		 * case).
		 * -Update (i++): This part updates the loop variable i after each iteration.
		 * Specifically, i++ increments i by 1.
		 * -The loop condition is checked again. If i is still less than 100, the loop
		 * continues. Otherwise, the loop terminates.
		 */
		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}

	}

}
