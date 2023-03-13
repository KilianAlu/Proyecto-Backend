package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EquipoDao;
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

}
