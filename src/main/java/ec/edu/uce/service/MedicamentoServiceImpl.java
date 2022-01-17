package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Medicamentos;
import ec.edu.uce.repository.IMedicamentoRepo;

@Service
public class MedicamentoServiceImpl implements IMedicamentoService {

	@Autowired
	private IMedicamentoRepo medicamentoRepo;
	
	@Override
	public void insertarNuevoMedicamento(Medicamentos medicamentos) {
		// TODO Auto-generated method stub
		this.medicamentoRepo.insertarMedicamento(medicamentos);
	}

	@Override
	public Medicamentos buscarMedicamentoPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.medicamentoRepo.buscarMedicamento(id);
	}

	@Override
	public void actualizarMedicamento(Medicamentos medicamentos) {
		// TODO Auto-generated method stub
		this.medicamentoRepo.actualizarMedicamento(medicamentos);
	}

	@Override
	public void borrarMedicamentoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.medicamentoRepo.borrarMedicamento(id);
	}

}
