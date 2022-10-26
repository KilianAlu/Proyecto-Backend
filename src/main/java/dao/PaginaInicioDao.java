package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.PaginaInicial;

@Service
public interface PaginaInicioDao {
	/*
	 * String recuperarAboutUs(); 
	 * String recuperarContacto();
	 */
	List<PaginaInicial> pruebaDao();
}
