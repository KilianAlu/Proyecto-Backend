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
	void cambiarApellidoJugador(@Param("id")int id, @Param("nombre")String apellido);


}
