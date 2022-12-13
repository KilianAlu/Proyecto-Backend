package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Usuario;

public interface UsuarioJpaSpring  extends JpaRepository<Usuario,Integer>{
	@Modifying
	@Query(value = "DELETE FROM `Foto` WHERE id = :id",nativeQuery=true)
	void deleteUsuario(@Param ("id") String id);
}
