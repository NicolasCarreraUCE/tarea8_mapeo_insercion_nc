package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Refrigerado;
import ec.edu.uce.repository.IRefrigeradoRepo;

@Service
public class RefrigeradoServiceImpl implements IRefrigeradoService {

	@Autowired
	private IRefrigeradoRepo refrigeradoRepo;
	
	@Override
	public void insertarNuevoRefrigerado(Refrigerado refrigerado) {
		// TODO Auto-generated method stub
		this.refrigeradoRepo.insertarRefrigerado(refrigerado);
	}

}
