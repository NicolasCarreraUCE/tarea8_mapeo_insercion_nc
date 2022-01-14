package ec.edu.uce.modelo;

public class Hogar {

	private Integer id;
	private String nom_producto;
	private String fecha_elaboracion;
	private Double peso_kilogramos;
	private Integer numero_unidades;
	
	@Override
	public String toString() {
		return "Hogar [id=" + id + ", nom_producto=" + nom_producto + ", fecha_elaboracion=" + fecha_elaboracion
				+ ", peso_kilogramos=" + peso_kilogramos + ", numero_unidades=" + numero_unidades + "]";
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
	public String getFecha_elaboracion() {
		return fecha_elaboracion;
	}
	public void setFecha_elaboracion(String fecha_elaboracion) {
		this.fecha_elaboracion = fecha_elaboracion;
	}
	public Double getPeso_kilogramos() {
		return peso_kilogramos;
	}
	public void setPeso_kilogramos(Double peso_kilogramos) {
		this.peso_kilogramos = peso_kilogramos;
	}
	public Integer getNumero_unidades() {
		return numero_unidades;
	}
	public void setNumero_unidades(Integer numero_unidades) {
		this.numero_unidades = numero_unidades;
	}
	
}
