package poo;


public class Coche {
	
	// ATRIBUTES
	private int ruedas; // encapsulo el dato (no se puede modificar)
	private int largo; //  Esto son atributos de la clase
	int ancho;
	int motor; 
	int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero;
	private boolean climatizador;
	
	//Método constructor: se encarga de dar estado inicial 
	// Mismo nombre que la clase
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	//METODO GETTER
	public String dime_datos(){
		
		return "La plataforma del coche tiene "+ ruedas+ " ruedas." + " Mide "+ largo/1000 + " metros de largo y "+ ancho + " cm de ancho, con un peso de "+ peso_plataforma+ " kgs.";
	}
	
	//METODO SETTER
	public void establece_color(String color_coche) {
		//color="azul";
		color = color_coche;
	}
	
	public String dime_color(){
		return "El color del coche es "+ color;
	}
	
	public void configura_Asientos(String asientos_cuero) {
		if(asientos_cuero=="true") {
			this.asientos_cuero=true; // 
		}
		else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {
		
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		}
		
		else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void config_climat(String climat) { //METODO SETTER
		
		if(climat == "true") {
			this.climatizador = true;
		}
		
		else {
			this.climatizador = false;
		}
	}
		
	public String dime_climat() {  //METODO SETTER
			
		if(climatizador == true) {
			return "El coche tiene climatizador";
		}
			
		else {
			return "El coche no tiene climatizador";
		}
	}
	
	//METODO SETTER Y GETTER A LA VEZ - práctica no recomendada
	
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma+ peso_carroceria;
		
		if(asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		
		if(climatizador == true) {
			peso_total = peso_total + 20;
		}
		
			return "El peso del coche es "+ peso_total;
	}
	
	public int precio_coche() {
		int precio_final = 10000;
		
		if(asientos_cuero == true) {
			precio_final+=2000;
		}
		
		if(climatizador == true) {
			precio_final+=1500;
		}
		
			return precio_final;
	}
	
}

