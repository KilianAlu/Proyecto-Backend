package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Usuario;
@Service
public class UsuarioDaoImpl implements UsuarioDao{
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	UsuarioJpaSpring Jpa;

	@Transactional
	@Override
	public void añadirUsuario(Usuario usuario) {
		 entityManager.createNativeQuery("INSERT INTO `usuario`(`nombre`, `contraseña`, `correo`, `fechaNacimiento`) VALUES (?,?,?,?)")
	      .setParameter(1, usuario.getNombre())
	      .setParameter(2, usuario.getContraseña())
	      .setParameter(3, usuario.getCorreo())
	      .setParameter(4, usuario.getFechaNacimiento())
	      .executeUpdate();
	}

}