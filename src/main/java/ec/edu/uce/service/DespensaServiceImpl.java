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

	@Override
	public Despensa buscarDespensaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.despensaRepo.buscarDespensa(id);
	}

	@Override
	public void actualizarDespensa(Despensa despensa) {
		// TODO Auto-generated method stub
		this.despensaRepo.actualizarDespensa(despensa);
	}

	@Override
	public void borrarDespensaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.despensaRepo.borrarDespensa(id);
	}

}
