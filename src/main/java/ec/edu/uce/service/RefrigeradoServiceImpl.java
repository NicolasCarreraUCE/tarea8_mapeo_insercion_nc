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

	@Override
	public Refrigerado buscarRefrigeradoPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.refrigeradoRepo.buscarRefrigerado(id);
	}

	@Override
	public void actualizarRefrigerado(Refrigerado refrigerado) {
		// TODO Auto-generated method stub
		this.refrigeradoRepo.actualizarRefrigerado(refrigerado);
	}

	@Override
	public void borrarRefrigeradoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.refrigeradoRepo.borrarRefrigerado(id);
	}

}
