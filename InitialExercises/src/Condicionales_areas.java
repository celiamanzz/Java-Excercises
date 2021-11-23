import java.util.*;
import javax.swing.*;
public class Condicionales_areas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opción \n1:cuadrado \n2:rectangulo \n3:triangulo \n4:circulo");
		int figura=entrada.nextInt();
		switch (figura) {
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
			System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
			break;
	
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El área del rectángulo es " + (base*altura));
			break;
			
		case 3:
			int Base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int Altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El área del triangulo es " + (Base*Altura)/2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El área del círuclo es " );
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)) );
			break;
			
			default:
				System.out.println("La opcion no es correcta");
		}
	}
}
