package poo;

import java.util.*;

public class Uso_empleado_ficherounico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Empleados empleado1 = new Empleados("Celia Manzano", 85000, 1990, 12, 17);
		
		//Empleados empleado2 = new Empleados("Javi Sanchez", 95000, 1995, 06, 2);
		
		//Empleados empleado3 = new Empleados("Nuria Laforga", 105000, 2002, 03, 15);
		
		//empleado1.subeSueldo(5);
		//empleado2.subeSueldo(5);
		//empleado3.subeSueldo(5);
		
		//System.out.println("Nombre: " + empleado1.dame_nombre()+ " Sueldo: " + empleado1.dame_sueldo() + " Fecha de alta: " + empleado1.dame_fecha_contrato());

		
		//-------------------------Alternativo!!!!!-----------------
		
		Empleados[] misEmpleados = new Empleados[3];
		
		misEmpleados[0] = new Empleados("Celia Manzano", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleados("Javi Sanchez", 95000, 1995, 06, 03);
		misEmpleados[2] = new Empleados("Nuria Laforga", 105000, 2002, 03, 15); 
		
		for(int i=0; i<misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dame_nombre()+ " Sueldo: " + misEmpleados[i].dame_sueldo() + " Fecha de alta: " + misEmpleados[i].dame_fecha_contrato());
			
		}
		
		// Tambien se puede hacer con un ForEach
		
		for(Empleados e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dame_nombre()+ " Sueldo: " + e.dame_sueldo() + " Fecha de alta: " + e.dame_fecha_contrato());
		}
	}

}

class Empleados {
	
	public Empleados(String nombre, double sueldo, int year, int month, int day){
	this.nombre = nombre;
	this.sueldo = sueldo;
	
	GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
	
	altaContrato = calendar.getTime();
		
	}
	
	public String dame_nombre(){ //getter
		return nombre;
	}
	
	public double dame_sueldo(){ //getter
		return sueldo;
	}
	
	public Date dame_fecha_contrato() { //getter
		return altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje) { //setter
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}