package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Verdura;
import ec.edu.uce.repository.VerduraRepoImpl;

@Service
public class VerduraServiveImpl implements IVerduraService {

	@Autowired
	private VerduraRepoImpl verduraRepo;
	
	@Override
	public void insertarNuevoVerdura(Verdura verdura) {
		// TODO Auto-generated method stub
		this.verduraRepo.insertarVerdura(verdura);
	}

}
