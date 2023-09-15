package services;

import java.util.List;

import repositories.EmpresaRepository;
import testdev.Empresa;

public class EmpresaService {
	private EmpresaRepository empresaRepository;

	public EmpresaService() {
		this.empresaRepository = EmpresaRepository.getInstance();
	}
	
	public List<Empresa> listarEmpresas(){
		return this.empresaRepository.getList();
	}
	
	

}
