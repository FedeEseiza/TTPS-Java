package models;

import java.util.Collection;

public class Usuario {
	private Long idUsuario;
	private String email;
	private String password;
	private Collection<Rol> roles;
	
	public Usuario(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
