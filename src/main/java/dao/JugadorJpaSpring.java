package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Foto;
import model.Jugador;
@Service
public interface JugadorJpaSpring extends JpaRepository<Jugador,Integer>{

	@Query(value = "Select * FROM Jugador Where idEquipo = :idEquipo", nativeQuery = true)
	List<Jugador> getJugadores(@Param ("idEquipo") int idEquipo);

	@Query(value = "Select * FROM Jugador Where idEquipo = :idEquipo AND nombre LIKE %:nombre%" , nativeQuery = true)
	List<Jugador> buscarJugador(@Param("idEquipo") int idEquipo,@Param ("nombre")String nombre);

	@Transactional
	@Query(value = "Update jugador set nombre = :nombre where id = :id")
	void cambiarNombreJugador(@Param("id")int id, @Param("nombre")String nombre);

	@Transactional
	@Query(value = "Update jugador set apellido = :apellido where id = :id")
	void cambiarApellidoJugador(@Param("id")int id, @Param("apellido")String apellido);

	@Transactional
	@Query(value = "Update jugador set rol = :rol where id = :id")
	void cambiarRolJugador(@Param("id")int id, @Param("rol")String rol);

	@Transactional
	@Query(value = "Update jugador set ManoDominante = :mano where id = :id")
	void cambiarManoJugador(@Param("id")int id, @Param("mano") String manoDominante);

	@Transactional
	@Query(value = "Update jugador set Foto = :foto where id = :id")
	void cambiarFotoJugador(@Param("id") int id, @Param("foto") String foto);

	@Transactional
	@Query(value = "Update jugador set posicion = :posicion where id = :id")
	void cambiarPosicionJugador(@Param("id")int id, @Param("posicion")String posicion);

	@Transactional
	@Query(value = "Update jugador set dorsal = :dorsal where id = :id")
	void cambiarDorsalJugador(@Param("id")int id, @Param("dorsal")int dorsal);

	@Transactional
	@Query(value = "Update jugador set idEquipo = :equipo where id = :id")
	void cambiarEquipoJugador(@Param("id")int id, @Param("equipo")int id2);

}
