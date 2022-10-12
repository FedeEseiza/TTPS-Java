package models;

import java.util.Collection;

public class Post {
	private Long idPost;
	private Long idEmprendimiento;
	private String texto;
	private Collection<Imagen> imagenes;
	
	public Long getIdPost() {
		return idPost;
	}
	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
