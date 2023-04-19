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
	JugadorJpaSpring jpa;
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
		return jpa.getJugadores(idEquipo);
	}

	@Override
	public List<Jugador> buscarJugador(int idEquipo,String nombre) {
		// TODO Auto-generated method stub
		return jpa.buscarJugador(idEquipo,nombre);
	}

	@Transactional
	@Override
	public void cambiarNombreJugador(int id, String nombre) {
		// TODO Auto-generated method stub
		jpa.cambiarNombreJugador(id,nombre);
	}

	@Transactional
	@Override
	public void cambiarApellidoJugador(int id, String apellido) {
		// TODO Auto-generated method stub
		jpa.cambiarApellidoJugador(id,apellido);
	}

	@Transactional
	@Override
	public void cambiarRolJugador(int id, String rol) {
		// TODO Auto-generated method stub
		jpa.cambiarRolJugador(id, rol);
	}

	@Transactional
	@Override
	public void cambiarManoJugador(int id, String manoDominante) {
		// TODO Auto-generated method stub
		jpa.cambiarManoJugador(id, manoDominante);
	}

	@Transactional
	@Override
	public void cambiarFotoJugador(int id, String foto) {
		// TODO Auto-generated method stub
		jpa.cambiarFotoJugador(id, foto);
	}

	@Transactional
	@Override
	public void cambiarPosicionJugador(int id, String posicion) {
		// TODO Auto-generated method stub
		jpa.cambiarPosicionJugador(id, posicion);
	}

	@Transactional
	@Override
	public void cambiarDorsalJugador(int id, int dorsal) {
		// TODO Auto-generated method stub
		jpa.cambiarDorsalJugador(id, dorsal);
	}

	@Transactional
	@Override
	public void cambiarEquipoJugador(int id, int id2) {
		// TODO Auto-generated method stub
		jpa.cambiarEquipoJugador(id, id2);
	}

	@Override
	public List<Jugador> buscarPosiciones(int idEquipo, String Posicion) {
		// TODO Auto-generated method stub
		return jpa.buscarPosiciones(idEquipo,Posicion);
	}

	
	

}
