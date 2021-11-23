import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aleatorio =(int)(Math.random()*100);
		int numero = 0;
		int intentos = 0;
		
		while (numero!=aleatorio){
			intentos++; //Aumenta en uno cada vez que vuelve a leer el while
		System.out.println("Introduce un numero por favor");
		numero = entrada.nextInt();
		if (aleatorio<numero) {
			System.out.println("Mas bajo");
		}
		else if (aleatorio>numero) {
			System.out.println("Mas alto");
		}
	
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
	}
// el do while es lo mismo pero asegurandonos que el programa lee  el codigo dentro del buvle al meno suna vez
	
}
