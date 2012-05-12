package de.broscode.sescon.domain.spieler;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Spieler {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Id
	private Long idSpieler;

	public Long getIdSpieler() {
		return idSpieler;
	}
	public void setIdSpieler(Long idSpieler) {
		this.idSpieler = idSpieler;
	}
}
