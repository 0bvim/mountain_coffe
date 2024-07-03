public class Main
{
	public static void main(String[] args)
	{
		int age;
		double payment, height;
		char gen;
		String name;

		age = 30;
		payment = 5800.5;
		height = 1.74;
		gen = 'M';
		name = "Marrie";
		
		System.out.println("Age = " + age);
		System.out.println("payment = " + String.format("%.2f", payment));
		System.out.println("height = " + String.format("%.2f", height));
		System.out.println("gen = " + gen);
		System.out.println("name = " + name);
	}
}
