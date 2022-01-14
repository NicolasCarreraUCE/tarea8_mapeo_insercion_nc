package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Fruta;

@Repository
public class FrutaRepoImpl implements IFrutaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarFruta(Fruta fruta) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				fruta.getId(),
				fruta.getNom_producto(),
				fruta.getFecha_elaboracion(),
				fruta.getFecha_caducidad(),
				fruta.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.frutas(\r\n"
				+ "	id_fruta, nom_producto, fecha_elaboracion, fecha_caducidad, peso_kilogramos)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

}
