package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import model.Foto;
@Service
public interface AboutUsJpaSpring extends JpaRepository<Foto,Integer>{
	@Query(value = "Select * FROM Foto Where Nombre Like %:nombre% ", nativeQuery = true)
	List<Foto> findIntegrante(@Param ("nombre") String nombre);
	@Query(value = "INSERT INTO 'Foto'(`Nombre`, `Especializacion`, `Informacion`, `Foto`) VALUES (:nombre,:especializacion,:informacion,:foto)", nativeQuery = true)
	Foto insertIntegrante(@Param ("nombre") String nombre , @Param ("especializacion") String especializacion, @Param("informacion") String informacion, @Param("foto") String foto);
	
}
