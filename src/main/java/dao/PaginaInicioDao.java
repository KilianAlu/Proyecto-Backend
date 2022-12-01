package dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.Foto;
import model.PaginaInicial;

@Service
public interface PaginaInicioDao {
	
	  String recuperarAboutUs(); 
	  String [] recuperarContacto();
	 
	  Optional<PaginaInicial> pruebaDao(String id);
	  List<Foto> getIntegrantesDao();
}
