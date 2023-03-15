package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Jugador;
@Repository
public class JugadorDaoImpl implements JugadorDao{
	@Autowired
	JugadorJpaSpring Jpa;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public void añadirJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		entityManager.createNativeQuery("INSERT INTO `Jugador`( `Nombre`, `Apellido`, `Salud`, `Rol`, `ManoDominante`, `Foto`, `Posicion`, `Dorsal`, `Altura`, `idEquipo`) VALUES (?,?,?,?,?,?,?,?,?,?)")
		.setParameter(1, jugador.getNombre())
		.setParameter(2, jugador.getApellido())
		.setParameter(3, jugador.getSalud())
		.setParameter(4, jugador.getRol())
		.setParameter(5, jugador.getManoDominante())
		.setParameter(6, "http://10.0.2.2/php/usuario.png")
		.setParameter(7, jugador.getPosicion())
		.setParameter(8, jugador.getDorsal())
		.setParameter(9, jugador.getAltura())
		.setParameter(10, jugador.getEquipo())
		.executeUpdate();
		
	}

	@Override
	public List<Jugador> getJugadores(int idEquipo) {
		// TODO Auto-generated method stub
		return Jpa.getJugadores(idEquipo);
	}

	@Override
	public List<Jugador> buscarJugador(int idEquipo,String nombre) {
		// TODO Auto-generated method stub
		return Jpa.buscarJugador(idEquipo,nombre);
	}

	@Transactional
	@Override
	public void cambiarNombreJugador(int id, String nombre) {
		// TODO Auto-generated method stub
		Jpa.cambiarNombreJugador(id,nombre);
	}

	@Override
	public void cambiarApellidoJugador(int id, String apellido) {
		// TODO Auto-generated method stub
		Jpa.cambiarApellidoJugador(id,apellido);
	}

}
