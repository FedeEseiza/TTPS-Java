package models;

import java.util.Collection;

public class Emprendimiento {
	private Long idEmprendimiento;
	private Long idUsuario;
	private String nombre;
	private String descripcion;
	private boolean mostrarManguitosRecibidos;
	private boolean mostrarTopDonadores;
	private double precioPorManguito;
	private Imagen imagen;
	private Plan plan;
	private Collection<Post> posteos;
	private Collection<FormaDePago> formasDePago;
	private Collection<RedSocial> redes;
	private Collection<Categoria> categorias;
	private Collection<HistorialManguitos> historialManguitos;
	private Collection<Donacion> donaciones;
		
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isMostrarManguitosRecibidos() {
		return mostrarManguitosRecibidos;
	}
	public void setMostrarManguitosRecibidos(boolean mostrarManguitosRecibidos) {
		this.mostrarManguitosRecibidos = mostrarManguitosRecibidos;
	}
	public boolean isMostrarTopDonadores() {
		return mostrarTopDonadores;
	}
	public void setMostrarTopDonadores(boolean mostrarTopDonadores) {
		this.mostrarTopDonadores = mostrarTopDonadores;
	}

	public double getPrecioPorManguito() {
		return precioPorManguito;
	}
	public void setPrecioPorManguito(double precioPorManguito) {
		this.precioPorManguito = precioPorManguito;
	}
	
	
}
