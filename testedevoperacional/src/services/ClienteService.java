package services;

import java.util.List;

import repositories.ClienteRepository;
import testdev.Cliente;

public class ClienteService {
	private ClienteRepository clienteRepository;

	public ClienteService() {
		this.clienteRepository = ClienteRepository.getInstance();
	}
	public List<Cliente> listarClientes(){
		return this.clienteRepository.getList();
	}
	
	

}
