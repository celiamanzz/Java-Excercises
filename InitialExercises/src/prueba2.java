import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		entrada.nextLine();
		double b = entrada.nextDouble();
		entrada.nextLine();
		String c = entrada.nextLine();
		
		System.out.println("String: "+ c);
		System.out.println("Double: "+ b);
		System.out.println("Int: "+ a);

	}

}
