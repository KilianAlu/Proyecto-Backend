package dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Foto;
import model.PaginaInicial;

@Repository
public class PaginaInicioDaoImpl implements PaginaInicioDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	PaginaInicioJpaSpring pagina;
	@Autowired
	FotoJpaSpring foto;
	
	  @Override public String recuperarAboutUs() { 
		  return pagina.getAboutUs(); 
		 
	  }
	  
	 
	@Override 
	public Optional<PaginaInicial> pruebaDao(String id) {
		// TODO Auto-generated method stub
		return pagina.findById(Integer.parseInt(id));
	}



	@Override
	public String[] recuperarContacto() {
		// TODO Auto-generated method stub
		return pagina.getContacto();
	}


	@Override
	public List<Foto> getIntegrantesDao() {
		// TODO Auto-generated method stub
		return foto.findAll();
	}


	@Override
	public List<Foto> getIntegrantesNombreDao(String nombre) {
		// TODO Auto-generated method stub
		return foto.findIntegrante(nombre);
	}
	

}

