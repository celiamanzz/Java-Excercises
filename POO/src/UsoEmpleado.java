package poo;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado celia = new Empleado("celia@salesforce.com", "celia", "SE");  // Objecto 2
		
		Org orgCelia = new Org("celia.org.com", 500);
		Org orgCelia2 = new Org("celia2.org.com", 1000);
		
		
		
		celia.addOrg(orgCelia);
		celia.addOrg(orgCelia2);
		
	
		
		System.out.println(celia.getEmail());
		celia.printOrgs();
		//System.out.println(celia.getListaOrgs());
		//System.out.println(celia.getListaOrgs().get(0).getUrl());
		
		//Empleado stan = new Empleado("stana@salesforce.com", "stan", "SE");  // Objecto 2
		//System.out.println(stan.getEmail());
	}

}
