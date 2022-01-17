package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Hogar;
import ec.edu.uce.repository.IHogarRepo;

@Service
public class HogarServiceImpl implements IHogarService {

	@Autowired
	private IHogarRepo hogarRepo;
	
	@Override
	public void insertarNuevoHogar(Hogar hogar) {
		// TODO Auto-generated method stub
		this.hogarRepo.insertarHogar(hogar);
	}

	@Override
	public Hogar buscarHogarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.hogarRepo.buscarHogar(id);
	}

	@Override
	public void actualizarHogar(Hogar hogar) {
		// TODO Auto-generated method stub
		this.hogarRepo.actualizarHogar(hogar);
	}

	@Override
	public void borrarHogarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.hogarRepo.borrarHogar(id);
	}

}
