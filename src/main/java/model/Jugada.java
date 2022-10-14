package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="")
@NamedQuery(name="Contacto.findAll", query="SELECT * FROM Contacto c")
public class Jugada  implements Serializable {
	
	private Jugador[] listaJugador;
	
	private String[] listaPosiciones;
}
