package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaginaInicioDaoImpl implements PaginaInicioDao {
	
	@Autowired
	PaginaInicioJpaSpring pagina;
	@Override
	public String recuperarAboutUs() {
		return pagina.getAboutUs();
	}

	@Override
	public String recuperarContacto() {
		// TODO Auto-generated method stub
		return null;
	}

}

