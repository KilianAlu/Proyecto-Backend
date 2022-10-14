package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="")
@NamedQuery(name="Contacto.findAll", query="SELECT * FROM Contacto c")
public class Jugador  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private int altura;
	
	private int peso;
	
	private String manoHabil;
}
