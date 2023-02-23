package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Foto;

@Repository
public class AboutUsDaoImpl implements AboutUsDao{

	@Autowired
	AboutUsJpaSpring Jpa;
	
	@Override
	public List<Foto> getIntegrantesDao() {
		// TODO Auto-generated method stub
		return Jpa.findAll();
	}


	@Override
	public List<Foto> getIntegrantesNombreDao(String nombre) {
		// TODO Auto-generated method stub
		return Jpa.findIntegrante(nombre);
	}
}
