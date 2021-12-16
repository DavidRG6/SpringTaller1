package com.nttdata.spring.services;

import com.nttdata.spring.persistence.NttdataPersona;

public interface NttdataPersonaManagementServiceI {
	/**
	 * Se crea una persona nueva 
	 * 
	 * @param nombre
	 * @param apellido
	 * @return NttdataPersona
	 */
	public NttdataPersona createPerson(final String nombre, final String apellido); 

}
