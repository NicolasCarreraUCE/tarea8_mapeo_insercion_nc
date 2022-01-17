package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Bebida;
import ec.edu.uce.repository.IBebidaRepo;

@Service
public class BebidaServiceImpl implements IBebidaService {

	@Autowired
	private IBebidaRepo bebidaRepo;
	
	@Override
	public void insertarNuevoBebida(Bebida bebida) {
		// TODO Auto-generated method stub
		this.bebidaRepo.insertarBebida(bebida);
	}

	@Override
	public Bebida buscarBebidaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.bebidaRepo.buscarBebida(id);
	}

	@Override
	public void actualizarBebida(Bebida bebida) {
		// TODO Auto-generated method stub
		this.bebidaRepo.actualizarBebida(bebida);
	}

	@Override
	public void borrarBebidaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.bebidaRepo.borrarBebida(id);
	}

}
