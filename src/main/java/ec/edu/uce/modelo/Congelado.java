package ec.edu.uce.modelo;

public class Congelado {
	
	private Integer id;
	private String nom_producto;
	private String fecha_caducidad;
	private Double temperatura_congelacion;
	private String tipo_producto;
	
	@Override
	public String toString() {
		return "Congelado [id=" + id + ", nom_producto=" + nom_producto + ", fecha_caducidad=" + fecha_caducidad
				+ ", tiempo_congelacion=" + temperatura_congelacion + ", tipo_producto=" + tipo_producto + "]";
	}
	
	// SET_GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom_producto() {
		return nom_producto;
	}
	public void setNom_producto(String nom_producto) {
		this.nom_producto = nom_producto;
	}
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public Double getTemperatura_congelacion() {
		return temperatura_congelacion;
	}
	public void setTemperatura_congelacion(Double tiempo_congelacion) {
		this.temperatura_congelacion = tiempo_congelacion;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	
}
