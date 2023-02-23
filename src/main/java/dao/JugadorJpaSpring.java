package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import model.Foto;
import model.Jugador;
@Service
public interface JugadorJpaSpring extends JpaRepository<Jugador,Integer>{

	@Query(value = "Select * FROM Jugador Where idEquipo = :idEquipo", nativeQuery = true)
	List<Jugador> getJugadores(@Param ("idEquipo") int idEquipo);

}
