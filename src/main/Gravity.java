/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		double g = 9.8;
		Scanner scanner = new Scanner(System.in);
		double time = scanner.nextDouble();
		double speed = g * time;
		double distance = 0.5 * g * time * time;
		System.out.println("The speed of the object at " + time + " seconds after its release is  " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is  " + distance);



	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
