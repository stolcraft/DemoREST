package eu.ensup.demoRest2.presentation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import eu.ensup.demoRest2.domaine.Employee;
import com.fasterxml.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoJson {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		Employee employe1 = new Employee("BA", "Amadou");
		Employee employe2 = new Employee("david", "le forceur");
		
		ArrayList<Employee> listemp = new ArrayList<Employee>();
		List<Employee> listemp2 = new ArrayList<Employee>();
		listemp.add(employe1);
		listemp.add(employe2);
		
		//Object vers fichier json
		File resultatFile = new File("employe.json");
		mapper.writeValue(resultatFile, listemp);
		
		File resultatFile2 = new File("test.json");
		
		//Permet d'afficher un objet 
		//listemp2 = mapper.readValue(resultatFile2, Employee.class);
		
		listemp2 = mapper.readValue(resultatFile2, List.class);
		System.out.println("empl dans la fichier : " + listemp2);
	}
	

}
