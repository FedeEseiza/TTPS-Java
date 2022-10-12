package models;

public class Categoria {
	private Long idCategoria;
	private String nombre;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
