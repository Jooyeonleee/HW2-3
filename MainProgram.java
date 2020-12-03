import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		MainProgram mainProgram = new MainProgram();
		mainProgram.printBanner();
		while (true) {
			int studentID = mainProgram.receiveStudentID();
			mainProgram.runModule(studentID);
		}
	}
	
	public void printBanner() {
		System.out.println("[2020-Fall Software Engineering]");
		System.out.println("Simple Software Development Project");
		System.out.println();
	}
	
	public int receiveStudentID() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a student ID: ");
		return input.nextInt();
	}
	
	public void runModule(int studentID) {
		if (studentID == 11530)
			System.out.println("No. It is the professor ID.\n");
		else {
			System.out.println("[Student ID: "+studentID+"]");
			printMenu();
			int menu = receiveMenu();
			int number = receiveNumber();
			if(menu == 1) {
				System.out.println("result(factorial): " + calFactorial(number));
			}
			else if(menu == 2) {
				System.out.println("result(absolute value): " + calAbsoluteValue(number));
			}
			
		}
	}
	
	public void printMenu() {
		System.out.println("1. Calculate factorial");
		System.out.println("2. Calculate absolute value");
	}
	
	public int receiveMenu() {
		Scanner scanMenu = new Scanner(System.in);
		System.out.print("Enter menu number: ");
		return scanMenu.nextInt();
	}
	
	public int receiveNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return scan.nextInt();
	}
	
	public int calFactorial(int number) {
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact *= i;
		}
		return fact;
	}
	
	public int calAbsoluteValue(int number) {
		int abs = -number;
		return abs;
	}

}