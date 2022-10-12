package models;

public class Plan {
	private Long idPlan;
	private Long idEmprendimiento;
	private Double montoManguito;
	private String descripcion;
	
	public Plan(Long idEmprendimiento, Double montoManguito, String descripcion) {
		this.idEmprendimiento = idEmprendimiento;
		this.montoManguito = montoManguito;
		this.descripcion = descripcion;
	}
	
	public Long getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
	}
	public Long getIdEmprendimiento() {
		return idEmprendimiento;
	}
	public void setIdEmprendimiento(Long idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}
	public Double getMontoManguito() {
		return montoManguito;
	}
	public void setMontoManguito(Double montoManguito) {
		this.montoManguito = montoManguito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
