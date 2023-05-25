package dao;

import java.util.List;

import model.Jugador;

public interface JugadorDao {

	void añadirJugador(Jugador jugador);

	List<Jugador> getJugadores(int idEquipo);

	List<Jugador> buscarJugador(int idEquipo,String nombre);

	void cambiarNombreJugador(int id, String nombre);

	void cambiarApellidoJugador(int id, String apellido);

	void cambiarRolJugador(int id, String rol);

	void cambiarManoJugador(int id, String manoDominante);

	void cambiarFotoJugador(int id, String foto);

	void cambiarPosicionJugador(int id, String posicion);

	void cambiarDorsalJugador(int id, int dorsal);

	void cambiarEquipoJugador(int id, int id2);

	List<Jugador> buscarPosicion(int idEquipo, String posicion);

	List<String> buscarNombrePosicion(int idEquipo, String posicion);

	void eliminarJugador(int idJugador);

}
