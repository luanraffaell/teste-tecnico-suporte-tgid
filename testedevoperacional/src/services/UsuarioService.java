package services;

import java.util.ArrayList;
import java.util.List;

import repositories.ClienteRepository;
import repositories.EmpresaRepository;
import testdev.Usuario;

public class UsuarioService {
	private List<Usuario> usuarios = new ArrayList<>();
	private EmpresaRepository empresaRepository;
	private ClienteRepository clienteRepository;
	
	
	public UsuarioService() {
		this.empresaRepository = EmpresaRepository.getInstance();
		this.clienteRepository = ClienteRepository.getInstance();
		carregarUsuarios();
	}
	
	public List<Usuario> getList(){
		return this.usuarios;
	}
	private void carregarUsuarios(){
		
		Usuario usuario1 = new Usuario("admin", "1234", null, null);
		Usuario usuario2 = new Usuario("empresa", "1234", null, this.empresaRepository.buscarEmpresaPorId(2));
		Usuario usuario3 = new Usuario("cliente", "1234", this.clienteRepository.buscarClientePorCpf("07221134049"), null);
		Usuario usuario4 = new Usuario("cliente2", "1234", this.clienteRepository.buscarClientePorCpf("72840700050"), null);
		Usuario usuario5 = new Usuario("empresa2", "1234", null, this.empresaRepository.buscarEmpresaPorId(1));
		Usuario usuario6 = new Usuario("empresa3", "1234", null, this.empresaRepository.buscarEmpresaPorId(3));
		this.usuarios.addAll(List.of(usuario1,usuario2,usuario3,usuario4,usuario5,usuario6));
		
	}
}
