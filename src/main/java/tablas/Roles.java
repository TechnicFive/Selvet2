package tablas;

// default package
// Generated 28 oct 2021 18:44:27 by Hibernate Tools 5.4.32.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles implements java.io.Serializable {

	private Integer id;
	private String rol;
	

	public Roles() {
	}

	public Roles(String rol) {
		this.rol = rol;
		
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
