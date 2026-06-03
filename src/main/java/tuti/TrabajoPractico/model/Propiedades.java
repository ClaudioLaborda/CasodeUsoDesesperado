package tuti.TrabajoPractico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
@Table(name = "publicaciones")
public class Propiedades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Cambiado a minúscula por convención
	
	@Column(name = "precio_mensual", nullable = false)
	private Double precioMensual;
	
	@Column(name = "condiciones_alquiler", columnDefinition = "TEXT", nullable = false)
	private String condiciones;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String descripcion;
	
	@Column(name = "fecha_publicacion", nullable = false)
	private LocalDate fechaPublicacion;
	
	@Column(name = "eliminada", nullable = false)
	private boolean eliminada = false;

	// Constructor vacío (Obligatorio para JPA)
	public Propiedades() {
	}
	
	// Constructor con parámetros (Limpio de caracteres invisibles)
	public Propiedades(Double precioMensual, String condiciones, String descripcion, LocalDate fechaPublicacion) {
		this.precioMensual = precioMensual;
		this.condiciones = condiciones;
		this.descripcion = descripcion;
		this.fechaPublicacion = fechaPublicacion;
		this.eliminada = false; 
	}

	// Getters y Setters corregidos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(Double precioMensual) {
		this.precioMensual = precioMensual;
	}

	public String getConditions() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public boolean isEliminada() {
		return eliminada;
	}

	public void setEliminada(boolean eliminada) {
		this.eliminada = eliminada;
	}
}