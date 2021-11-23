package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajadores empleado1 = new Trabajadores("Celia");
		
		Trabajadores empleado2 = new Trabajadores("Javi");
		
		empleado1.cambiaSeccion("Preventa");
		
		System.out.println(empleado1.devuelveDatos());
		
		System.out.println(empleado2.devuelveDatos());

	}

	
	
	
	
}

class Trabajadores {
	
	private final String nombre; //Con el final lo convierto en constante y no se puede cambiar el valor
	
	private String sector;
	
	private int Id;
	
	private static int IdSiguiente = 1;
	
	//Constructor
	
	public Trabajadores(String nombre) {
		
		this.nombre = nombre;
		
		Id = IdSiguiente;
		
		sector = "Administracion";
		
		IdSiguiente++;
		
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.sector = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " y la sección: " + sector + " y el ID= " + Id ;
	}
	
}