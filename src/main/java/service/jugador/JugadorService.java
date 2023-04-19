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
	void cRolJugador(int id, String rol);
	void cManoJugador(int id, String manoDominante);
	void cFotoJugador(int id, String foto);
	void cPosicionJugador(int id, String posicion);
	void cDorsalJugador(int id, int dorsal);
	void cEquipoJugador(int id, int id2);
	List<Jugador> buscarPosiciones(int idEquipo, String posicion);
}
