package models;

public class Rol {
	private Long idRol;
	private Long idUsuario;
	private String nombreRol;
	
	public Rol(Long idRol, Long idUsuario, String nombreRol) {
		this.idRol = idRol;
		this.idUsuario = idUsuario;
		this.nombreRol = nombreRol;
	}
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	
}
