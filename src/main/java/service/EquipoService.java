package service;

import model.dto.EquipoDto;
import model.Equipo;

public interface EquipoService {

	void anadirEquipo(EquipoDto  aEquipo);
	void cNombre(int id, String nombre);
	void cFoto(int id,String foto);


}
