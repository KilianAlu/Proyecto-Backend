package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.JugadorDao;
import model.Jugador;
@Service
public class JugadorServiceImpl implements JugadorService {
	@Autowired
	JugadorDao Dao;
	@Override
	public void añadirJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		System.out.println(jugador.getEquipo());
		Dao.añadirJugador(jugador);
	}

	@Override
	public List<Jugador> getJugadores(int idEquipo) {
		return Dao.getJugadores(idEquipo);
		// TODO Auto-generated method stub
		
	}
	
}