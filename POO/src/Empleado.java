package poo;

import java.util.ArrayList;

public class Empleado {
	
	// Atributos
	private String email;
	private String nombre;
	private String puesto;
	private ArrayList<Org> listaOrgs = new ArrayList<Org>();
	
	// Constructor -> Da valores INICIALES a los atributos
	public Empleado(String email, String nombre, String puesto) {
		this.email = email;
		this.nombre = nombre;
		this.puesto = puesto;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void changeEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<Org> getListaOrgs(){
		return this.listaOrgs;
	}
	
	public void addOrg(Org newOrg) {
		this.listaOrgs.add(newOrg);
	}
	
	public void printOrgs(){
		
		for(int i=0; i< this.listaOrgs.size();i++) {
			System.out.println(this.listaOrgs.get(i).getUrl());
			System.out.println(this.listaOrgs.get(i).getTam());
		}
	}

}
