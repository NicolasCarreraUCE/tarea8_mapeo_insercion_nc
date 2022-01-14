package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bebida;

@Repository
public class BebidaRepoImpl implements IBebidaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarBebida(Bebida bebida) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				bebida.getId(),
				bebida.getNom_producto(),
				bebida.getFecha_elaboracion(),
				bebida.getFecha_caducidad(),
				bebida.getPorcentaje_alcohol()
		};
		this.jdbcTemplate.update("INSERT INTO public.bebidas(\r\n"
				+ "	id_bebida, nom_producto_bebida, fecha_elaboracion_bebida, fecha_caducidad_bebida, porcentaje_alcohol_bebida)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

}
