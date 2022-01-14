package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Congelado;
import ec.edu.uce.repository.ICongeladoRepo;

@Service
public class CongeladoServiceImpl implements ICongeladoService {

	@Autowired
	private ICongeladoRepo congeladoRepo;
	
	@Override
	public void insertarNuevoCongelado(Congelado congelado) {
		// TODO Auto-generated method stub
		this.congeladoRepo.insertarCongelado(congelado);
	}

}
