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
	
}
