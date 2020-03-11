package eu.ensup.demoRest2.domaine;

public class Employee {
	
	private String nom;
	private String prenom;
	public Employee(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public Employee() {
		super();
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
