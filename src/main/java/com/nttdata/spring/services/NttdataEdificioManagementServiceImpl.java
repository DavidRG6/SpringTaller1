package com.nttdata.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttdataEdificio;
import com.nttdata.spring.persistence.NttdataPersona;

@Service
public class NttdataEdificioManagementServiceImpl implements NttdataEdificioManagementServiceI {

	@Override
	public NttdataEdificio createBuilding(final int numPlantas, final int numPuertas) {
		return new NttdataEdificio(numPlantas, numPuertas);
	}

	@Override
	public void insert(NttdataEdificio edificio, final int numPlanta, final int numPuerta, final NttdataPersona persona) {
		Object[][] sizeEdificio =edificio.getEdificio();
		int maxFloor=sizeEdificio.length;
		int maxDoor=sizeEdificio[0].length;
		if (numPlanta<=maxFloor && numPlanta>=0) {
			if (numPuerta<=maxDoor && numPuerta>=0) {
				edificio.addPerson(numPlanta, numPuerta, persona);
			}
		}
	}

	@Override
	public List<NttdataPersona> searchAll(NttdataEdificio edificio) {
		NttdataPersona[][] vecinos= edificio.mostrarVecinos();
		final ArrayList<NttdataPersona> personas =new ArrayList<NttdataPersona>();
		for (int i = 0; i < vecinos.length; i++) {
			for (int j = 0; j < vecinos[i].length; j++) {
				if (vecinos[i][j]!=null) {
					personas.add(vecinos[i][j]);
				}
			}
		}
		
		return personas;
	}

}
