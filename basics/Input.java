//package to use scanner to capture user input
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Need to creat a new object of scanner to read the input
		Scanner sc = new Scanner(System.in);

		System.out.print("Age: ");
		int age = sc.nextInt();

		System.out.print("Payment: ");
		double payment = sc.nextDouble();

		System.out.print("Gen: ");
		char gen = sc.next().charAt(0);

		// warning: when use nextLine method, you need to clean the next it before call it again.
		System.out.print("Name: ");
		String name = sc.nextLine();
		//cleaning below
		sc.nextLine();

		// after use scanner you need to close it
		sc.close();
		System.out.println("Age = " + age);
		System.out.println("payment = " + String.format("%.2f", payment));
		System.out.println("gen = " + gen);
		System.out.println("name = " + name);
	}
}

