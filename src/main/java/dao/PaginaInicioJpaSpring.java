package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.Query;

import model.PaginaInicial;
@Service
public interface PaginaInicioJpaSpring extends JpaRepository<PaginaInicial,Integer>{
	@Query(value = "Select Integrantes from paginaInicial Where id = 1", nativeQuery = true)
	String getAboutUs();
	@Query(value = "Select email,telefono from paginaInicial Where id = 1", nativeQuery = true)
	String [] getContacto();
	@Query(value = "INSERT INTO `paginaInicial`( `telefono`, `email`, `Integrantes`) VALUES ('[value-2]','[value-3]','[value-4]')", nativeQuery = true)
	PaginaInicial a();
	
}
