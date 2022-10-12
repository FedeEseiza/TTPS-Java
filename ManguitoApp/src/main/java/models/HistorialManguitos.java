package models;

import java.sql.Date;

public class HistorialManguitos {
	private Long id;
	private Long idEmprendimiento;
	private Double precio;
	private Date fecha;
	
	public HistorialManguitos(Long idEmprendimiento, Double precio, Date fecha) {
		this.idEmprendimiento = idEmprendimiento;
		this.precio = precio;
		this.fecha = fecha;
	}
	
}
