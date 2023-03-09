package service.aboutus;

import java.util.List;

import model.Foto;

public interface AboutUsService {
	
	public List<Foto> getIntegrantesService() ;
	public List<Foto> getIntegrantesNombreService(String nombre);
}
