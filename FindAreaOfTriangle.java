import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the triangle: ");
		double base = scanner.nextDouble();
		
		System.out.println("Enter the height of the triangle: ");
		double height = scanner.nextDouble();
		
		//Area = (width*height)/2
		double area = (base*height)/2;
		System.out.println("Area of triangle is: " + area);
		
	}

}
