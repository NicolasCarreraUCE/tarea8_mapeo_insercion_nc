package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Despensa;

@Repository
public class DespensaRepoImpl implements IDespensaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarDespensa(Despensa despensa) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				despensa.getId(),
				despensa.getNom_producto(),
				despensa.getFecha_elaboracion(),
				despensa.getFecha_caducidad(),
				despensa.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.despensa(\r\n"
				+ "	id_despensa, nom_producto_despensa, fecha_elavoracion_despensa, fecha_caducidad_despensa, peso_kilogramos_despensa)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

}
