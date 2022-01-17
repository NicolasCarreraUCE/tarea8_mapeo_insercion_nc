package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Fruta;
import ec.edu.uce.repository.IFrutaRepo;

@Service
public class FrutasServiceImpl implements IFrutaService {

	@Autowired
	private IFrutaRepo frutaRepo;
	
	@Override
	public void insertarNuevoFruta(Fruta fruta) {
		// TODO Auto-generated method stub
		this.frutaRepo.insertarFruta(fruta);
	}

	@Override
	public Fruta buscarFrutaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.frutaRepo.buscarFruta(id);
	}

	@Override
	public void actualizarFruta(Fruta fruta) {
		// TODO Auto-generated method stub
		this.frutaRepo.actualizarFruta(fruta);
	}

	@Override
	public void borrarFrutaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.frutaRepo.borrarFruta(id);
	}

}
