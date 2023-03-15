package service;

import model.dto.EquipoDto;

import java.util.List;

import model.Equipo;

public interface EquipoService {

	void anadirEquipo(EquipoDto  aEquipo);
	void cNombre(int id, String nombre);
	void cFoto(int id,String foto);
	List<Equipo> getEquipos();


}
