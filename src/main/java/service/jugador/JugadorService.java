package service.jugador;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Jugador;
@Service
public interface JugadorService {
	void añadirJugador(Jugador jugador);
	List<Jugador> getJugadores(int idEquipo);
	List<Jugador> buscarJugador(int idEquipo,String nombre);
	void cNombreJugador(int id,String nombre);
	void cApellidoJugador(int id, String apellido);
}
