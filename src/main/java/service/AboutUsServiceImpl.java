package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AboutUsDao;
import model.Foto;
@Service
public class AboutUsServiceImpl implements AboutUsService{
	@Autowired
	AboutUsDao Dao;
	@Override
	public List<Foto> getIntegrantesService() {
		// TODO Auto-generated method stub
		return Dao.getIntegrantesDao();
	}

	@Override
	public List<Foto> getIntegrantesNombreService(String nombre) {
		// TODO Auto-generated method stub
		return Dao.getIntegrantesNombreDao(nombre);
	}
}
