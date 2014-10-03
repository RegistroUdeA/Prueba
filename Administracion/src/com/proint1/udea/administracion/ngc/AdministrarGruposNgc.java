package com.proint1.udea.administracion.ngc;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.proint1.udea.administracion.dao.GrupoDTO;
import com.proint1.udea.administracion.dao.GrupoOperacionesDAO;

/**
 * Clase de Negocio para realizar la administraci�n de los grupos
 * @author Daniela Yepes - Danilo Mej�a
 * @since 19/09/2014
 */

public class AdministrarGruposNgc implements GrupoOperacionesIntDAO,Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2081122064650467756L;


	GrupoOperacionesDAO grupoOperacionesDAO;	
	
	
	private static Logger logger=Logger.getLogger(PersonaNgc.class);
	
	@Override
	public List<GrupoDTO> getGrupoList() {
		logger.info("consultando Grupos");
		return grupoOperacionesDAO.getGrupoList();
	}

	
	@Override
	public String almacenarGrupo(GrupoDTO grupoDTO) {
		logger.info("almacenando grupos");
		grupoOperacionesDAO.almacenarGrupo(grupoDTO);
		return null;
	}
	
	@Override
	public List<GrupoDTO> buscarGrupo(String idGrupo) {
		logger.info("buscando Grupo");
		return grupoOperacionesDAO.buscarGrupo(idGrupo);
	}

	@Override
	public void eliminarGrupo(GrupoDTO grupoDTO) {
		logger.info("eliminando Grupo");
		grupoOperacionesDAO.eliminarGrupo(grupoDTO);
	}
	
	@Override
	public void editarGrupo(GrupoDTO grupoDTO) {
		logger.info("editando Grupo");
		grupoOperacionesDAO.editarGrupo(grupoDTO);
	}

/*	@Override
	public List<DependenciaAcademica> getDependenciaList() {
		logger.info("consultando dependencias");
		return grupoOperacionesDAO.getDependenciaList();
	}*/


	public GrupoOperacionesDAO getGrupoOperacionesDAO() {
		return grupoOperacionesDAO;
	}


	public void setGrupoOperacionesDAO(GrupoOperacionesDAO grupoOperacionesDAO) {
		this.grupoOperacionesDAO = grupoOperacionesDAO;
	}

	
	
	
}
