package dao;

import java.util.List;

import model.Equipo;
import model.Jugador;
import model.dto.EquipoDto;

public interface EquipoDao {

	void anadirEquipo(EquipoDto aEquipo);

	void cambiarNombre(int id, String nombre);
	void cambiarFoto(int id, String foto);

	List<Equipo> getEquipos(int idEntrenador);

	List<Equipo> buscarEquipo(int idEquipo, String nombre);

}
