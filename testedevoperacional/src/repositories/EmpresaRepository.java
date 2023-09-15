package repositories;

import java.util.ArrayList;
import java.util.List;

import testdev.Empresa;

public class EmpresaRepository {
	private static EmpresaRepository INSTANCE = null;
	private List<Empresa> empresas = new ArrayList<>();
	
	private EmpresaRepository() {
		Empresa empresa = new Empresa(2, "SafeWay Padaria", "30021423000159", 0.15, 0.0);
		Empresa empresa2 = new Empresa(1, "Level Varejo", "53239160000154", 0.05, 0.0);
		Empresa empresa3 = new Empresa(3, "SafeWay Restaurante", "41361511000116", 0.20, 0.0);
		empresas.addAll(List.of(empresa,empresa2,empresa3));
	}
	
	public List<Empresa> getList(){
		return this.empresas;
	}
	
	public Empresa buscarEmpresaPorId(Integer id) {
		return empresas.stream()
				.filter(e -> e.getId().equals(id))
				.findFirst().orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
	}
	
	public static EmpresaRepository getInstance(){
		if(INSTANCE == null) {
			return new EmpresaRepository();
		}
		return INSTANCE;
	}

}
