package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import model.Foto;

public interface FotoJpaSpring extends JpaRepository<Foto,Integer>{
	@Query(value = "Select Nombre,Especializacion,Informacion,Foto from Foto ", nativeQuery = true)
	List<String> getIntegrantesJpa();
}
