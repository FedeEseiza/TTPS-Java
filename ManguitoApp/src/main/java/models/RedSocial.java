package models;

public class RedSocial {
	private Long id;
	private String nombreRed;
	private Imagen icono;
	
	public RedSocial(Long id, String nombreRed, Imagen icono) {
		this.id = id;
		this.nombreRed = nombreRed;
		this.icono = icono;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreRed() {
		return nombreRed;
	}
	public void setNombreRed(String nombreRed) {
		this.nombreRed = nombreRed;
	}
	public Imagen getIcono() {
		return icono;
	}
	public void setIcono(Imagen icono) {
		this.icono = icono;
	}
	
	
}
