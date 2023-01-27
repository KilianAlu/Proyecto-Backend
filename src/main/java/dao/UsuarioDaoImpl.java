package dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Usuario;
@Repository
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
	      .setParameter(2, DigestUtils.md5Hex(usuario.getContraseña()))
	      .setParameter(3, usuario.getCorreo())
	      .setParameter(4, usuario.getFechaNacimiento())
	      .executeUpdate();
	}

	@Transactional
	@Override
	public void eliminarUsuario(String id) {
		Jpa.deleteById(Integer.parseInt(id));
	}

	@Override
	public int BuscarUsuarioId(String id) {
		if((Jpa.findById(Integer.parseInt(id))) != null){
			return Integer.parseInt(id);
		};
		return 0;
	}
	

	@Override
	public Usuario login(String nombre, String contrasena) {
			return Jpa.login(nombre,contrasena);
	}

	@Override
	public int  existeUsuario(String nombre, String contrasena) {
		// TODO Auto-generated method stub
		return Jpa.existeUsuario(nombre, contrasena);
	}

	@Override
	public Optional<Usuario> infoUsuarioId(String id) {
		// TODO Auto-generated method stub
		return Jpa.findById(Integer.parseInt(id));
	}

}
