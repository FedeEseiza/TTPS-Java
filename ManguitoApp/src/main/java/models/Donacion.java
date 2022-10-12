package models;

import java.sql.Date;

public class Donacion {
	private Long idDonacion;
	private Long idEmprendimiento;
	private int cantidadManguitos;
	private String contacto;
	private Date fecha;
	private String nombreDonante;
	private String mensaje;
	
	public Donacion(Long idEmprendimiento, int cantidadManguitos, String contacto, Date fecha, String nombreDonante,
			String mensaje) {
		super();
		this.idEmprendimiento = idEmprendimiento;
		this.cantidadManguitos = cantidadManguitos;
		this.contacto = contacto;
		this.fecha = fecha;
		this.nombreDonante = nombreDonante;
		this.mensaje = mensaje;
	}
	public Long getIdDonacion() {
		return idDonacion;
	}
	public void setIdDonacion(Long idDonacion) {
		this.idDonacion = idDonacion;
	}
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	public int getCantidadManguitos() {
		return cantidadManguitos;
	}
	public void setCantidadManguitos(int cantidadManguitos) {
		this.cantidadManguitos = cantidadManguitos;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombreDonante() {
		return nombreDonante;
	}
	public void setNombreDonante(String nombreDonante) {
		this.nombreDonante = nombreDonante;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
