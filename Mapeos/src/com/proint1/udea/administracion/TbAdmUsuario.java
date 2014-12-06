package com.proint1.udea.administracion;

// default package
// Generated 24/11/2014 10:29:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmUsuario generated by hbm2java
 */
public class TbAdmUsuario implements java.io.Serializable {

	private long nbUsuIdn;
	private TbAdmPersona tbAdmPersona;
	private String vrUsuLogin;
	private long nbUsuActivo;
	private Set tbAdmUsuarioxrols = new HashSet(0);

	public TbAdmUsuario() {
	}

	public TbAdmUsuario(long nbUsuIdn, TbAdmPersona tbAdmPersona,
			String vrUsuLogin, long nbUsuActivo) {
		this.nbUsuIdn = nbUsuIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.vrUsuLogin = vrUsuLogin;
		this.nbUsuActivo = nbUsuActivo;
	}

	public TbAdmUsuario(long nbUsuIdn, TbAdmPersona tbAdmPersona,
			String vrUsuLogin, long nbUsuActivo, Set tbAdmUsuarioxrols) {
		this.nbUsuIdn = nbUsuIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.vrUsuLogin = vrUsuLogin;
		this.nbUsuActivo = nbUsuActivo;
		this.tbAdmUsuarioxrols = tbAdmUsuarioxrols;
	}

	public long getNbUsuIdn() {
		return this.nbUsuIdn;
	}

	public void setNbUsuIdn(long nbUsuIdn) {
		this.nbUsuIdn = nbUsuIdn;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public String getVrUsuLogin() {
		return this.vrUsuLogin;
	}

	public void setVrUsuLogin(String vrUsuLogin) {
		this.vrUsuLogin = vrUsuLogin;
	}

	public long getNbUsuActivo() {
		return this.nbUsuActivo;
	}

	public void setNbUsuActivo(long nbUsuActivo) {
		this.nbUsuActivo = nbUsuActivo;
	}

	public Set getTbAdmUsuarioxrols() {
		return this.tbAdmUsuarioxrols;
	}

	public void setTbAdmUsuarioxrols(Set tbAdmUsuarioxrols) {
		this.tbAdmUsuarioxrols = tbAdmUsuarioxrols;
	}

}
