package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		//scanner part
		Scanner scanner = new Scanner(System.in);
		//main part
		System.out.println("Enter a for addition, Enter b for subtract, Enter c for multiplication, Enter d for division");
		String operatorData = scanner.nextLine();
		
		//if part
		if(operatorData.equals("a")) {
			System.out.println("Enter first number");
			String firstNumberData = scanner.nextLine();
			int firstNumber = Integer.parseInt(firstNumberData);
			System.out.println("Enter second number");
			String secondNumberData = scanner.nextLine();
			int secondNumber = Integer.parseInt(secondNumberData);
			System.out.println(firstNumber + secondNumber);
			System.out.println("Type x to do equation again!!!!");
			String playAgain = scanner.nextLine();
			if(playAgain.equals("x")) {
				main(null);
			}
		}
		if(operatorData.equals("b")) {
			System.out.println("Enter first number");
			String firstNumberData = scanner.nextLine();
			int firstNumber = Integer.parseInt(firstNumberData);
			System.out.println("Enter second number");
			String secondNumberData = scanner.nextLine();
			int secondNumber = Integer.parseInt(secondNumberData);
			System.out.println(firstNumber - secondNumber);
			System.out.println("Type x to do equation again!!!!");
			String playAgain = scanner.nextLine();
			if(playAgain.equals("x")) {
				main(null);
			}
		}
		
		if(operatorData.equals("c")) {
			System.out.println("Enter first number");
			String firstNumberData = scanner.nextLine();
			int firstNumber = Integer.parseInt(firstNumberData);
			System.out.println("Enter second number");
			String secondNumberData = scanner.nextLine();
			int secondNumber = Integer.parseInt(secondNumberData);
			System.out.println(firstNumber * secondNumber);
			System.out.println("Type x to do equation again!!!!");
			String playAgain = scanner.nextLine();
			if(playAgain.equals("x")) {
				main(null);
			}
		}
		
		if(operatorData.equals("d")) {
			System.out.println("Enter first number");
			String firstNumberData = scanner.nextLine();
			int firstNumber = Integer.parseInt(firstNumberData);
			System.out.println("Enter second number");
			String secondNumberData = scanner.nextLine();
			int secondNumber = Integer.parseInt(secondNumberData);
			System.out.println(firstNumber / secondNumber);
			System.out.println("Type x to do equation again!!!!");
			String playAgain = scanner.nextLine();
			if(playAgain.equals("x")) {
				main(null);
			}
		}
		
	}
}
