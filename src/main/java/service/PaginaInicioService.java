package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.Foto;
import model.PaginaInicial;

@Service
public interface PaginaInicioService {
	String aboutUs();
	String[] contacto();
	Optional<PaginaInicial> pruebaService(String id);
	List<Foto> getIntegrantesService();
	List<Foto> getIntegrantesNombreService(String nombre);
	Foto añadirIntegrante(Foto integrante);
	
}
