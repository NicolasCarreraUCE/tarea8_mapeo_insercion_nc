package ec.edu.uce.service;

import ec.edu.uce.modelo.Medicamentos;

public interface IMedicamentoService {
	void insertarNuevoMedicamento(Medicamentos medicamentos);
	Medicamentos buscarMedicamentoPorId(Integer id);
	void actualizarMedicamento(Medicamentos medicamentos);
	void borrarMedicamentoPorId(Integer id);
}
