package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Equipo;

public interface EquipoJpaSpring extends JpaRepository<Equipo,Integer>{

	@Modifying
	@Query(value = "UPDATE Equipo SET `Nombre` = :nombre WHERE id = :id", nativeQuery = true)
	void cambiarNombre(@Param("id") int id, @Param("nombre") String nombre);

	@Modifying
	@Query(value = "UPDATE Equipo SET `Foto` = :foto  WHERE id = :id", nativeQuery = true)
	void cambiarFoto(@Param("id")int id, @Param("foto")String foto);

	@Query(value = "Select * from Equipo where idEntrenador = :id",nativeQuery = true)
	List<Equipo> getEquipos(@Param("id")int idEntrenador);
}
