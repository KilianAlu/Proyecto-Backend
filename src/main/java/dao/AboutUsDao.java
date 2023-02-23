package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Foto;

@Service
public interface AboutUsDao {
	List<Foto> getIntegrantesDao();
	  List<Foto> getIntegrantesNombreDao(String nombre);
}
