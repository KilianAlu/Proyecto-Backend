package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import dao.PaginaInicioDao;
import model.Foto;
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
	public Optional<PaginaInicial> pruebaService(String id) {
		// TODO Auto-generated method stub
		return Dao.pruebaDao(id);
	}

	@Override
	public List<Foto> getIntegrantesService() {
		// TODO Auto-generated method stub
		return Dao.getIntegrantesDao();
	}
	

}