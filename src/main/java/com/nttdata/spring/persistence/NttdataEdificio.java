package com.nttdata.spring.persistence;

/**
 * SIMULA TU REPOSITORIO (MEZCLA ENTRE ENTIDAD Y REPO O DAO)
 * 
 * @author driverog
 *
 */
public class NttdataEdificio {

	private NttdataPersona[][] edificio;

	public NttdataEdificio(final int numPlantas, final int numPuerta) {
		this.edificio = new NttdataPersona[numPlantas][numPuerta];
	}
	
	/**
	 * Añade una nueva persona al edificio
	 * 
	 * @param numPlanta
	 * @param numPuerta
	 * @param persona
	 */
	public void addPerson(final int numPlanta, final int numPuerta, final NttdataPersona persona) {
		this.edificio[numPlanta][numPuerta] = persona;
	}
	/**
	 * Se devuelve el edifico que se ha creado
	 * 
	 * @return NttdataPersona[][]
	 */
	public NttdataPersona[][] mostrarVecinos() {
		return this.edificio;
	}

	/**
	 * @return the edificio
	 */
	public NttdataPersona[][] getEdificio() {
		return edificio;
	}

	/**
	 * @param edificio
	 *            the edificio to set
	 */
	public void setEdificio(NttdataPersona[][] edificio) {
		this.edificio = edificio;
	}

}
