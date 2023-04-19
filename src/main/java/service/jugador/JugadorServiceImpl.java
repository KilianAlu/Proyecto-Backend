package service.jugador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.JugadorDao;
import model.Jugador;
@Service
public class JugadorServiceImpl implements JugadorService {
	@Autowired
	JugadorDao dao;
	@Override
	public void añadirJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		System.out.println(jugador.getEquipo());
		dao.añadirJugador(jugador);
	}

	@Override
	public List<Jugador> getJugadores(int idEquipo) {
		return dao.getJugadores(idEquipo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jugador> buscarJugador(int idEquipo, String nombre) {
		// TODO Auto-generated method stub
		return dao.buscarJugador(idEquipo,nombre);
	}

	@Override
	public void cNombreJugador(int id, String nombre) {
		// TODO Auto-generated method stub
		dao.cambiarNombreJugador(id,nombre);
	}

	@Override
	public void cApellidoJugador(int id, String apellido) {
		// TODO Auto-generated method stub
		dao.cambiarApellidoJugador(id,apellido);
	}

	@Override
	public void cRolJugador(int id, String rol) {
		// TODO Auto-generated method stub
		dao.cambiarRolJugador(id,rol);
	}

	@Override
	public void cManoJugador(int id, String manoDominante) {
		// TODO Auto-generated method stub
		dao.cambiarManoJugador(id, manoDominante);
	}

	@Override
	public void cFotoJugador(int id, String foto) {
		// TODO Auto-generated method stub
		dao.cambiarFotoJugador(id,foto);
	}

	@Override
	public void cPosicionJugador(int id, String posicion) {
		// TODO Auto-generated method stub
		dao.cambiarPosicionJugador(id, posicion);
	}

	@Override
	public void cDorsalJugador(int id, int dorsal) {
		// TODO Auto-generated method stub
		dao.cambiarDorsalJugador(id, dorsal);
	}

	@Override
	public void cEquipoJugador(int id, int id2) {
		// TODO Auto-generated method stub
		dao.cambiarEquipoJugador(id,id2);
	}

	@Override
	public List<Jugador> buscarPosicion(int idEquipo,String Posicion){
		// TODO Auto-generated method stub
		return dao.buscarPosicion(idEquipo,Posicion);
	}

	@Override
	public List<String> buscarNombrePosicion(int idEquipo, String posicion) {
		// TODO Auto-generated method stub
		return dao.buscarNombrePosicion(idEquipo,posicion);
	}
	
}
