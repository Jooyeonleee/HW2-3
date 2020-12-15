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
		else if (studentID == 1714376) {
			System.out.println("[Student ID: "+studentID+"]");
			printMenu_1714376();
			int menu = receiveMenu();
			if(menu == 1) {
				int number = receiveNumber();
				System.out.println("result(fibonacci): " + calFibonacci(number) + "\n");
			}
			else if(menu == 2) {
				System.out.print("Enter the first number: ");
				int a = receiveGCDnumbers();
				System.out.print("Enter the second number: ");
				int b = receiveGCDnumbers();
				System.out.println("result(GCD): " + calGCD(a, b) + "\n");
			}
		}
		else if (studentID == 1712905){
			System.out.println("[Student ID: "+studentID+"]");
			printMenu();
			int menu = receiveMenu1712905();
			if (menu == 1){
				int number = receiveNumber1712905();
				if(number>=0){
					System.out.println("result(factorial): "+ Factorial1712905(number));
				}
				else{
					System.out.println("Wrong number");
;				}
			}
			else if (menu == 2){
				int number = receiveNumber1712905();
				System.out.println("result(absolute value): " + Abs1712905(number));
			}
			else{
				System.out.println("Wrong menu number");
			}
			
		}

		else if(studentID == 1714490){
			System.out.println("[Student ID: "+studentID+"]");
			printMenu_1714490();
			int menu = selectMenu();
			if(menu == 1) {
				int number = receiveNumberFact();
				if (number >=0) {
					System.out.println(number+" factorial is "+ calFactorial(number)+"\n");
				}
				else{
					System.out.println("You should put a number 0 or greater"+"\n");
				}
				
			}
			else if (menu == 2) {
				int number = receiveNumberAbs();
				System.out.println(number+"'s absolute value is "+ calAbsolute(number)+"\n");
			}
			else {
				System.out.println("Wrong menu number");
			}
		}
		else if(studentID == 1713661) {
			printMyCalculator_1713661(studentID);
		}
		
		else {
			System.out.println("[Student ID: "+studentID+"]");
			printMenu();
			int menu = receiveMenu();
			int number = receiveNumber();
			if(menu == 1) {
				System.out.println("result(factorial): " + Factorial(number));
			}
			else if(menu == 2) {
				System.out.println("result(absolute value): " + Abs(number));
			}
			
		}
	}
	
	public void printMenu_1714376() {
		System.out.println("1. Calculate fibonacci");
		System.out.println("2. Calculate greatest common division");
	}

	public void printMenu() {
		System.out.println("1. Calculate factorial");
		System.out.println("2. Calculate absolute value");
	}

	public void printMenu1712905() {
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
	
	public int receiveGCDnumbers() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public int receiveMenu1712905(){
		Scanner scanMenu = new Scanner(System.in);
		System.out.print("Enter menu number: ");
		int num = scanMenu.nextInt();
		if (num <1 || num>2){
			return -1;
		}
		else{
			return num;
		}
	}
	public int receiveNumber1712905(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return scan.nextInt();
	}

	
	public int calFibonacci(int number) {
		if (number == 1) return 0;
		if (number == 2) return 1;
		return calFibonacci(number-1) + calFibonacci(number-2);
	}
	
	public int calGCD(int a, int b) {
		if(a < 0) a = a * (-1);
		if(b < 0) b = b * (-1);
		
		if (a>=b) {
			if(b == 0) return a;
			return calGCD(b, a % b);
		}
		else {
			if(a == 0) return b;
			return calGCD(a, b % a);
		}
	}
	
	public int Factorial(int number) {
		int fac = 1;
		for(int i=1;i<=number;i++) {
			fac *= i;
		}
		return fac;
	}
	public int Factorial1712905(int number){
		int factorial = 1;
		for(int i = 1;i <= number;i++){
			factorial *= i;
		}
		return factorial;
	}
	public int Abs(int number) {
		int abs = (number >= 0) ? number : -number;
		return abs;
	}
	
	public int Abs1712905(int number){
		int abs = (number >= 0) ? number : -number;
		return abs;
	}

	public void printMenu_1714490() {
		System.out.println("1. Calculate factorial");
		System.out.println("2. Calculate absolute value");
	}
	
	public int selectMenu() {
		Scanner choseMenu = new Scanner(System.in);
		System.out.print("Enter menu number: ");
		return choseMenu.nextInt();
	}
	public int receiveNumberFact() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number(0 or greater): ");
		return scan.nextInt();
	}
	public int receiveNumberAbs() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return scan.nextInt();
	}
		
	public int calFactorial(int number) {
		int facResult = 1;
		for (int i=number; i>0; i--) {
			facResult  = facResult * i;
		}
		return facResult;
	}
	public int calAbsolute(int number){
		if (number < 0) return -number;
		else return number;
	}
	
	
	
	
	public void printMyCalculator_1713661(int studentID) {
		System.out.println("[Student ID: " + studentID +"]");
		System.out.println("1.Calculate factorial");
		System.out.println("2.Calculate absolute value");
		System.out.print("Enter menu number: ");
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		switch(menu) {
			case 1:
				calculateFactorial_1713661();
				break;
			case 2:
				calculateAbsoluteValue_1713661();
				break;
			default:
				System.out.println("Error! Input right number!");
			
		}
	}
	
	public void calculateFactorial_1713661() {
		int numFact;
		int resultFact = 1;
		
		while(true) {
			System.out.print("Enter a number: ");
			Scanner scan = new Scanner(System.in);
			numFact = scan.nextInt();
			if(numFact < 0) {
				System.out.println("Error! Input positive number!");
			}
			else break;
		}
		for(int i=numFact;i>0;i--) {
			resultFact *= i; 
		}
		System.out.println(numFact+"! ="+resultFact+"\n");
		
	}
	
	public void calculateAbsoluteValue_1713661() {
		int numAbs;
		int resultAbs;
		
		System.out.print("Enter a number: ");
		Scanner scan2 = new Scanner(System.in);
		numAbs = scan2.nextInt();
		if(numAbs >=0) resultAbs = numAbs;
		else resultAbs = -numAbs;
		System.out.println("|"+numAbs+"| = "+resultAbs);
	}



}