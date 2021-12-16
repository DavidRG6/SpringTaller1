package com.nttdata.spring.persistence;

/**
 * SIMULA TU REPOSITORIO (MEZCLA ENTRE ENTIDAD Y REPO O DAO)
 * 
 * @author driverog
 *
 */
public class NttdataPersona {
	private String nombre;
	private String apellidos;

	public NttdataPersona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 *            the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
