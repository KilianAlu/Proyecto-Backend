package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Usuario;

public interface UsuarioJpaSpring extends JpaRepository<Usuario, Integer> {
	@Modifying
	@Query(value = "DELETE FROM `usuario` WHERE id = :id", nativeQuery = true)
	void deleteUsuario(@Param("id") String id);

	@Query(value = "SELECT * FROM `usuario` WHERE nombre = :nombre AND contraseña = :contrasena", nativeQuery = true)
	Usuario login(@Param("nombre") String nombre, @Param("contrasena") String contrasena);
	
	@Query(value = "SELECT EXISTS(SELECT * FROM `usuario` WHERE nombre = :nombre AND contraseña = :contrasena)", nativeQuery = true)
	int cLogin(@Param("nombre") String nombre, @Param("contrasena") String contrasena);
}
