package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Verdura;

@Repository
public class VerduraRepoImpl implements IVerduraRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarVerdura(Verdura verdura) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				verdura.getId(),
				verdura.getNom_producto(),
				verdura.getFecha_elaboracion(),
				verdura.getFecha_caducidad(),
				verdura.getPeso_kilogramos()
		};
		this.jdbcTemplate.update("INSERT INTO public.verduras(\r\n"
				+ "	id_vertura, nom_verdura, fecha_elaboracion_verdura, fecha_caducidad_verdura, peso_kilogramos_verdura)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)", datosAInsertar);

	}

}
