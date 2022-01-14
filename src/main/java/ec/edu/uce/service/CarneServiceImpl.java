package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Carne;
import ec.edu.uce.repository.ICarneRepo;

@Service
public class CarneServiceImpl implements ICarneService {

	@Autowired
	private ICarneRepo carneRepo;
	
	@Override
	public void insertarNuevoCarne(Carne carne) {
		// TODO Auto-generated method stub
		this.carneRepo.insertarCarne(carne);
	}

}
