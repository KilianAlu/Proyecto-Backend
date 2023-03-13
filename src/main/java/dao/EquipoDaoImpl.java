package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.dto.EquipoDto;


@Repository
public class EquipoDaoImpl implements EquipoDao{

	@Autowired
	EquipoJpaSpring jpa;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public void anadirEquipo(EquipoDto aEquipo) {
		// TODO Auto-generated method stub
		entityManager.createNativeQuery("INSERT INTO `Equipo` (`Nombre`,`idEntrenador`,`Foto`) VALUES (?,?,?)")
		.setParameter(1, aEquipo.getNombre())
		.setParameter(2, aEquipo.getIdEntrenador())
		.setParameter(3,"http://10.0.2.2/php/usuario.png")
		.executeUpdate();
	}

}
