package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.PaginaInicial;

@Repository
public class PaginaInicioDaoImpl implements PaginaInicioDao {
	
	@Autowired
	PaginaInicioJpaSpring pagina;
	@Override
	public String recuperarAboutUs() {
		return null;
	}

	@Override
	public String recuperarContacto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaginaInicial> pruebaDao() {
		// TODO Auto-generated method stub
		return pagina.findAll();
	}

}

