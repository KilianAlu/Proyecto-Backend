package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="")
@NamedQuery(name="Contacto.findAll", query="SELECT * FROM Contacto c")
public class Anotacion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.)
	
}
