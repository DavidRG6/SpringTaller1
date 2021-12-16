package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttdataEdificio;
import com.nttdata.spring.persistence.NttdataPersona;

public interface NttdataEdificioManagementServiceI {
	/**
	 * Se crea y devuelve la creacion de un edificio con plantas y puertas que tu defines
	 * 
	 * @param numPlantas
	 * @param numPuerta
	 * @return NttdataEdificio
	 */
	public NttdataEdificio createBuilding(final int numPlantas, final int numPuerta); 
	
	/**
	 *Se inserta un nuevo vecino en el edificio
	 * 
	 * @param edificio
	 * @param numPlanta
	 * @param numPuerta
	 * @param persona
	 */
	public void insert(NttdataEdificio edificio, final int numPlanta, final int numPuerta, final NttdataPersona persona);
	/**
	 * Se  muestra todos los vecinos que hay en el edificio
	 * 
	 * @param edificio
	 * @return List<NttdataPersona>
	 */
	public List<NttdataPersona> searchAll(NttdataEdificio edificio);

	

}
