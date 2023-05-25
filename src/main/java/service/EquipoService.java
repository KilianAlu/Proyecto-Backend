package service;

import model.dto.EquipoDto;

import java.util.List;

import model.Equipo;
import model.Jugador;

public interface EquipoService {

	void anadirEquipo(EquipoDto  aEquipo);
	void cNombre(int id, String nombre);
	void cFoto(int id,String foto);
	List<Equipo> getEquipos(int idEntrenador);
	List<Equipo> buscarEquipo(int idEquipo, String nombre);
	void eliminarEquipo(int idEquipo);


}
