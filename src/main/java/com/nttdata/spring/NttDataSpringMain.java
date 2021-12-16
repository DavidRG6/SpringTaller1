package com.nttdata.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttdataEdificio;
import com.nttdata.spring.persistence.NttdataPersona;
import com.nttdata.spring.services.NttdataEdificioManagementServiceI;
import com.nttdata.spring.services.NttdataPersonaManagementServiceI;

/**
 * 
 * @author driverog
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {
	@Autowired
	NttdataPersonaManagementServiceI personaService;
	@Autowired
	NttdataEdificioManagementServiceI edificoService;

	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Persona 1
		NttdataPersona Persona1 = personaService.createPerson("Pepe", "Perez");
		// Persona 2
		NttdataPersona Persona2 = personaService.createPerson("Pepe", "Martinez");
		// Persona 3
		NttdataPersona Persona3 = personaService.createPerson("Ana", "Maria");
		// Persona 4
		NttdataPersona Persona4 = personaService.createPerson("Albert", "Perez");
		// Persona 5
		NttdataPersona Persona5 = personaService.createPerson("Manuel", "Castañez");

		// Edificio
		NttdataEdificio edificio = edificoService.createBuilding(5, 5);
		
		//Insertar Personas
		edificoService.insert(edificio, 0, 0, Persona1);

		edificoService.insert(edificio, 2, 4, Persona2);

		edificoService.insert(edificio, 3, 1, Persona3);

		edificoService.insert(edificio, 4, 2, Persona4);

		edificoService.insert(edificio, 3, 2, Persona5);
		
		//Mostrar Vecinos
		
		for (NttdataPersona list : edificoService.searchAll(edificio)) {
			System.out.println(
			        list.getNombre() + " | " + list.getApellidos());
		}
	}
}
