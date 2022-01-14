package ec.edu.uce.modelo;

public class Pescado {

	private Integer id;
	private String nom_producto;
	private String fecha_caducidad;
	private Double peso_kilogramos;
	private String tipo_agua;
	
	@Override
	public String toString() {
		return "Pescado [id=" + id + ", nom_producto=" + nom_producto + ", fecha_caducidad=" + fecha_caducidad
				+ ", peso_kilogramos=" + peso_kilogramos + ", tipo_agua=" + tipo_agua + "]";
	}
	
	// SET-GET
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
	public Double getPeso_kilogramos() {
		return peso_kilogramos;
	}
	public void setPeso_kilogramos(Double peso_kilogramos) {
		this.peso_kilogramos = peso_kilogramos;
	}
	public String getTipo_agua() {
		return tipo_agua;
	}
	public void setTipo_agua(String tipo_agua) {
		this.tipo_agua = tipo_agua;
	}
}
