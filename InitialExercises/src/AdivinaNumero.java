import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Quiero un numero entre 0 y 100 entero
		//random() me saca un numero aleatorio entre 0 y 1
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio){
			intentos++; //Cuando entre al while le aumenta un valor
			System.out.println("Introduce un numero por favor");
			
			numero = entrada.nextInt(); //Almacena el ultimo entero q meto por consola
			
			if(aleatorio<numero){
				
				System.out.println("Más bajo");
			}
			
			else if(aleatorio>numero) {
				
				System.out.println("Más alto");
			}
			
			
		}
		
		System.out.println("Correcto. Lo has conseguido en " +intentos+" intentos");
	}

}
