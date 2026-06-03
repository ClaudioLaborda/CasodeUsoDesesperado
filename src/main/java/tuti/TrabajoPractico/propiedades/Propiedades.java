package tuti.TrabajoPractico.propiedades;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import java.time.LocalDate;



@Entity
@Table(name = "publicaciones")
public class Propiedades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "precio_mensual", nullable = false)
	private Double precioMensual;
	
	@Lob
	@Column(name = "condiciones_alquiler", columnDefinition = "TEXT", nullable = false)
	
	
	private String condiciones;
	
	@Lob
	@Column(columnDefinition = "TEXT", nullable = false)
	private String descripcion;
	
	
	@Column(name = "fecha_publicacion", nullable = false)
	private LocalDate fechaPublicacion;
	
	
	@Column(name = "eliminada", nullable = false)
	private boolean eliminada = false;


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Double getPrecioMensual() {
		return precioMensual;
	}


	public void setPrecioMensual(Double precioMensual) {
		this.precioMensual = precioMensual;
	}


	public String getCondiciones() {
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
	
	
	
	
	// Constructor vacio
	public Propiedades() {
	}
	
	// Constructor  
	public Propiedades(Double precioMensual, String condiciones, String descripcion, LocalDate fechaPublicacion) {
	    this.precioMensual = precioMensual;
	    this.condiciones = condiciones;
	    this.descripcion = descripcion;
	    this.fechaPublicacion = fechaPublicacion;
	    this.eliminada = false; // 
	}
	
	
}
