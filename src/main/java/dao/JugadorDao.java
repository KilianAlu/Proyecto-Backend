package dao;

import java.util.List;

import model.Jugador;

public interface JugadorDao {

	void añadirJugador(Jugador jugador);

	List<Jugador> getJugadores(int idEquipo);

}
