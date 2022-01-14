package ec.edu.uce.modelo;

public class Carne {

	private Integer id;
	private String nom_producto;
	private String fecha_caducidad;
	private Double pocentaje_grasa;
	private Double peso_kilogramos;
	
	@Override
	public String toString() {
		return "Carne [id=" + id + ", nom_producto=" + nom_producto + ", fecha_caducidad=" + fecha_caducidad
				+ ", pocentaje_grasa=" + pocentaje_grasa + ", peso_kilogramos=" + peso_kilogramos + "]";
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
	public Double getPocentaje_grasa() {
		return pocentaje_grasa;
	}
	public void setPocentaje_grasa(Double pocentaje_grasa) {
		this.pocentaje_grasa = pocentaje_grasa;
	}
	public Double getPeso_kilogramos() {
		return peso_kilogramos;
	}
	public void setPeso_kilogramos(Double peso_kilogramos) {
		this.peso_kilogramos = peso_kilogramos;
	}
	
	
}
