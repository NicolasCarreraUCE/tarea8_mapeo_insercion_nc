package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Despensa;
import ec.edu.uce.repository.IDespensaRepo;

@Service
public class DespensaServiceImpl implements IDespensaService {

	@Autowired
	private IDespensaRepo despensaRepo;
	
	@Override
	public void insertarNuevoDespensa(Despensa despensa) {
		// TODO Auto-generated method stub
		this.despensaRepo.insertarDespensa(despensa);
	}

}
