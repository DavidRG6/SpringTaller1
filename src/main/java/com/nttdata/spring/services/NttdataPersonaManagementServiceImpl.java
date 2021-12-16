package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttdataPersona;

@Service
public class NttdataPersonaManagementServiceImpl implements NttdataPersonaManagementServiceI {

	@Override
	public NttdataPersona createPerson(String nombre, String apellido) {
		return new NttdataPersona(nombre, apellido);
	}

}
