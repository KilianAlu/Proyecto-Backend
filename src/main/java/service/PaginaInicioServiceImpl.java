package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import dao.PaginaInicioDao;
import model.PaginaInicial;

@Component
public class PaginaInicioServiceImpl implements PaginaInicioService{

	@Autowired
	PaginaInicioDao Dao;
	
	  @Override public String aboutUs() { // TODO Auto-generated method stub return
	  return Dao.recuperarAboutUs(); }
	  
	  @Override public String[] contacto() { // TODO Auto-generated method stub
	  return Dao.recuperarContacto(); }
	 

	@Override
	public List<PaginaInicial> pruebaService() {
		// TODO Auto-generated method stub
		return Dao.pruebaDao();
	}

}