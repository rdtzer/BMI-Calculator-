package day4;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter your weight in pounds");

		double weightInPounds = scanner.nextDouble();

		System.out.println("Enter your height in meters");

		double height = scanner.nextDouble();

		// To convert lbs to kg, multiply the given lbs value by 0.45359237 kg.
		double weightInkg = weightInPounds * 0.45359237;
		// BMI = weight (kg) / height(m)²

		double bmi = weightInkg / (height * height);

		System.out.println("Your BMI is: " + bmi);
		
		if (bmi<18.5)
		{
			System.out.println("You are underweight");
		}
		else if (bmi>=18.5 && bmi<24.9)
		{
			System.out.println("You are a healthy weight");
		}
			else if (bmi>=25 && bmi<29.9)
			{
				System.out.println("You are overweightt");
			}
				else 
				{
					System.out.println("You are obese");
				}
			}
	
}
		
	




