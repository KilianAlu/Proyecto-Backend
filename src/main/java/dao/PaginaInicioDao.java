package dao;

import org.springframework.stereotype.Service;

@Service
public interface PaginaInicioDao {
	String recuperarAboutUs();
	String recuperarContacto();
}
