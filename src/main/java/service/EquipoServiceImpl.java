package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EquipoDao;
import model.Equipo;
import model.dto.EquipoDto;

@Service
public class EquipoServiceImpl implements EquipoService{
	
	@Autowired
	EquipoDao dao;

	@Override
	public void anadirEquipo(EquipoDto  aEquipo) {
		// TODO Auto-generated method stub
		dao.anadirEquipo(aEquipo);
	}

	@Override
	public void cNombre(int id, String nombre) {
		// TODO Auto-generated method stub
		dao.cambiarNombre(id,nombre);
	}

	@Override
	public void cFoto(int id, String foto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Equipo> getEquipos(int idEntrenador) {
		// TODO Auto-generated method stub
		return dao.getEquipos(idEntrenador);
	}

}
