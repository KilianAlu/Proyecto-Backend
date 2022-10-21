package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PaginaInicioDao;

public class PaginaInicioServiceImpl implements PaginaInicioService{

	@Autowired
	PaginaInicioDao Dao;
	@Override
	public String aboutUs() {
		// TODO Auto-generated method stub
		return Dao.recuperarAboutUs();
	}

	@Override
	public String contacto() {
		// TODO Auto-generated method stub
		return null;
	}

}
