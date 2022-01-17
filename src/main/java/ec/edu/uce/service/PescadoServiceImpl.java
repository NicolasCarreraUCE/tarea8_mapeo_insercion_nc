package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Pescado;
import ec.edu.uce.repository.IPescadoRepo;

@Service
public class PescadoServiceImpl implements IPescadoService {

	@Autowired
	private IPescadoRepo pescadoRepo;
	
	@Override
	public void insertarNuevoPescado(Pescado pescado) {
		// TODO Auto-generated method stub
		this.pescadoRepo.insertarPescado(pescado);
	}

	@Override
	public Pescado buscarPescadoPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pescadoRepo.buscarPescado(id);
	}

	@Override
	public void actualizarPescado(Pescado pescado) {
		// TODO Auto-generated method stub
		this.pescadoRepo.actualizarPescado(pescado);
	}

	@Override
	public void borrarPescadoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.pescadoRepo.borrarPescado(id);
	}

}
