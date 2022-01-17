package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Verdura;
import ec.edu.uce.repository.IVerduraRepo;
import ec.edu.uce.repository.VerduraRepoImpl;

@Service
public class VerduraServiveImpl implements IVerduraService {

	@Autowired
	private IVerduraRepo verduraRepo;
	
	@Override
	public void insertarNuevoVerdura(Verdura verdura) {
		// TODO Auto-generated method stub
		this.verduraRepo.insertarVerdura(verdura);
	}

	@Override
	public Verdura buscarVerduraPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.verduraRepo.buscarVerdura(id);
	}

	@Override
	public void actualizarVerdura(Verdura verdura) {
		// TODO Auto-generated method stub
		this.verduraRepo.actualizarVerdura(verdura);
	}

	@Override
	public void borraVerdurarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.verduraRepo.borrarVerdura(id);
	}

}
