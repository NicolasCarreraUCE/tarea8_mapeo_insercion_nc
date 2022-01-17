package ec.edu.uce.repository;

import ec.edu.uce.modelo.Medicamentos;

public interface IMedicamentoRepo {
	void insertarMedicamento(Medicamentos medicamentos);
	Medicamentos buscarMedicamento(Integer id);
	void actualizarMedicamento(Medicamentos medicamentos);
	void borrarMedicamento(Integer id);
}
