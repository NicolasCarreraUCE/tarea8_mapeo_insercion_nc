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

}
