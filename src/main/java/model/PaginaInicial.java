package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the paginaInicial database table.
 * 
 */
@Entity
@NamedQuery(name="PaginaInicial.findAll", query="SELECT p FROM PaginaInicial p")
public class PaginaInicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String aboutUs;

	@Lob
	private String contacto;

	public PaginaInicial() {
	}

	public String getAboutUs() {
		return this.aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

}