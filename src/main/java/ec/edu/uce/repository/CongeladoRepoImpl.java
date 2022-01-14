package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Congelado;

@Repository
public class CongeladoRepoImpl implements ICongeladoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarCongelado(Congelado congelado) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				congelado.getId(),
				congelado.getNom_producto(),
				congelado.getFecha_caducidad(),
				congelado.getTemperatura_congelacion(),
				congelado.getTipo_producto()
		};
		this.jdbcTemplate.update("INSERT INTO public.congelados(\r\n"
				+ "	id_congelados, nom_producto_congelado, fecha_caducidad_congelado, temperatura_congelado, tipo_producto_congelado)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)",datosAInsertar);
	}

}
