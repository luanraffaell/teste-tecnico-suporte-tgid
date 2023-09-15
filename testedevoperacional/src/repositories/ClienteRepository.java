package repositories;

import java.util.ArrayList;
import java.util.List;

import testdev.Cliente;

public class ClienteRepository {
	private static ClienteRepository INSTANCE = null;
	private List<Cliente> clientes = new ArrayList<>();
	
	private ClienteRepository() {
		Cliente cliente = new Cliente("07221134049", "Allan da Silva", "cliente", 20);
		Cliente cliente2 = new Cliente("72840700050", "Samuel da Silva", "cliente2", 24);
		clientes.addAll(List.of(cliente,cliente2));
		
	}
	public List<Cliente> getList(){
		return this.clientes;
	}
	public Cliente buscarClientePorCpf(String cpf) {
		return clientes.stream()
				.filter(c -> c.getCpf().equals(cpf))
				.findFirst().orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
	}
	
	public static ClienteRepository getInstance(){
		if(INSTANCE == null) {
			return new ClienteRepository();
		}
		return INSTANCE;
	}

}
