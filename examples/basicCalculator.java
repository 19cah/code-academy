import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		Scanner readFromline = new Scanner(System.in);
		
		double num1, num2, total;
		
		System.out.print("Enter first number: ");
		num1 = readFromline.nextDouble();
		System.out.print("Enter Second number: ");
		num2 = readFromline.nextDouble();
		
		total = num1 + num2;
		System.out.println(total);
		
	}
}
