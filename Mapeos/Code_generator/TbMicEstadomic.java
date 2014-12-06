package com.proint1.udea.microcurriculo;

// default package
// Generated 24/11/2014 10:29:53 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbMicEstadomic generated by hbm2java
 */
public class TbMicEstadomic implements java.io.Serializable {

	private BigDecimal nbEstIdn;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private String vrEstNombreest;
	private TbMicMicrocurriculo tbMicMicrocurriculo;

	public TbMicEstadomic() {
	}

	public TbMicEstadomic(BigDecimal nbEstIdn) {
		this.nbEstIdn = nbEstIdn;
	}

	public TbMicEstadomic(BigDecimal nbEstIdn, String vrAdtusuario,
			Date dtAdtfecha, String vrEstNombreest,
			TbMicMicrocurriculo tbMicMicrocurriculo) {
		this.nbEstIdn = nbEstIdn;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.vrEstNombreest = vrEstNombreest;
		this.tbMicMicrocurriculo = tbMicMicrocurriculo;
	}

	public BigDecimal getNbEstIdn() {
		return this.nbEstIdn;
	}

	public void setNbEstIdn(BigDecimal nbEstIdn) {
		this.nbEstIdn = nbEstIdn;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public String getVrEstNombreest() {
		return this.vrEstNombreest;
	}

	public void setVrEstNombreest(String vrEstNombreest) {
		this.vrEstNombreest = vrEstNombreest;
	}

	public TbMicMicrocurriculo getTbMicMicrocurriculo() {
		return this.tbMicMicrocurriculo;
	}

	public void setTbMicMicrocurriculo(TbMicMicrocurriculo tbMicMicrocurriculo) {
		this.tbMicMicrocurriculo = tbMicMicrocurriculo;
	}

}
