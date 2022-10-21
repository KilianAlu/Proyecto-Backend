package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

import model.PaginaInicial;

@Service
public interface PaginaInicioJpaSpring extends JpaRepository<PaginaInicial,Integer>{
	@Query("Select AboutUs from paginaInicial Where id = 1")
	String getAboutUs();
}
