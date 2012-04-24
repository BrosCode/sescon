package de.broscode.sescon.domain.spieler;

import javax.persistence.Column;
import javax.persistence.Entity;

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
}
