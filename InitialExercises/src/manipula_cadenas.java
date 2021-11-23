
public class manipula_cadenas {

	public static void main(String[] args) {
		String nombre="Celia";
		System.out.println("mi nombre es " + nombre);
		System.out.println("mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		// ultimo caracter de la longitud
		 int ultima_letra = nombre.length();
		 System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1)
		 );
		 String frase="Hoy es un estupendo dia para aprender a programar en Java";
		 String resumen=frase.substring(0, 29); //el caracter 3 es el primero que no quiero que este
		 System.out.println(resumen);
		 
		 //metodo equals
		 String alumno1, alumno2;
		 alumno1="David";
		 alumno2="David";
		 System.out.println(alumno1.equals(alumno2)); //devuelve true or false
	}

}
