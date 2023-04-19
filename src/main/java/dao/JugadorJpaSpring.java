package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

	@Modifying
	@Query(value = "Update jugador set nombre = :nombre where id = :id" , nativeQuery = true)
	void cambiarNombreJugador(@Param("id")int id, @Param("nombre")String nombre);

	@Modifying
	@Query(value = "Update jugador set apellido = :apellido where id = :id" , nativeQuery = true)
	void cambiarApellidoJugador(@Param("id")int id, @Param("apellido")String apellido);

	@Modifying
	@Query(value = "Update jugador set rol = :rol where id = :id", nativeQuery = true)
	void cambiarRolJugador(@Param("id")int id, @Param("rol")String rol);

	@Modifying
	@Query(value = "Update jugador set ManoDominante = :mano where id = :id", nativeQuery = true)
	void cambiarManoJugador(@Param("id")int id, @Param("mano") String manoDominante);
	
	@Modifying
	@Query(value = "Update jugador set Foto = :foto where id = :id", nativeQuery = true)
	void cambiarFotoJugador(@Param("id") int id, @Param("foto") String foto);

	@Modifying
	@Query(value = "Update jugador set posicion = :posicion where id = :id", nativeQuery = true)
	void cambiarPosicionJugador(@Param("id")int id, @Param("posicion")String posicion);

	@Modifying
	@Query(value = "Update jugador set dorsal = :dorsal where id = :id", nativeQuery = true)
	void cambiarDorsalJugador(@Param("id")int id, @Param("dorsal")int dorsal);

	@Modifying
	@Query(value = "Update jugador set idEquipo = :equipo where id = :id", nativeQuery = true)
	void cambiarEquipoJugador(@Param("id")int id, @Param("equipo")int id2);

	@Query(value = "select * From jugador where  Posicion = :posicion AND idEquipo = :idEquipo", nativeQuery = true)
	List<Jugador> buscarPosiciones(@Param("idEquipo") int idEquipo, @Param("posicion")String posicion);

}
