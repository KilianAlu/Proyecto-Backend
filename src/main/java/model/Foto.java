package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Foto database table.
 * 
 */
@Entity
@NamedQuery(name="Foto.findAll", query="SELECT f FROM Foto f")
public class Foto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOTO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="FOTO_ID_GENERATOR")
	private int id;
	
	private String nombre;
	
	private String especializacion;
	
	@Lob
	private String informacion;
	
	@Lob
	private String foto;

	

	

	public Foto() {
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecializacion() {
		return this.especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getInformacion() {
		return this.informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}