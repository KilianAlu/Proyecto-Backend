package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="")
@NamedQuery(name="Contacto.findAll", query="SELECT * FROM Contacto c")
public class Equipo  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idEquipo;
	
	private String nombre;
	
	private Jugador[] listaJugadores;
}
