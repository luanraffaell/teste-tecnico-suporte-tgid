package services;

import java.util.List;

import repositories.EmpresaRepository;
import repositories.ProdutoRepository;
import testdev.Produto;

public class ProdutoService {
	private ProdutoRepository produtoRepository;
	private EmpresaRepository empresaRepository;
	
	public ProdutoService() {
		this.produtoRepository = ProdutoRepository.getInstance();
		this.empresaRepository = EmpresaRepository.getInstance();
		carregarProdutos();
		
		
	}

	private void carregarProdutos() {
		Produto produto = new Produto(1, "Pão Frances", 5, 3.50, empresaRepository.buscarEmpresaPorId(2));
		Produto produto2 = new Produto(2, "Coturno", 10, 400.0, empresaRepository.buscarEmpresaPorId(1));
		Produto produto3 = new Produto(3, "Jaqueta Jeans", 15, 150.0, empresaRepository.buscarEmpresaPorId(1));
		Produto produto4 = new Produto(4, "Calça Sarja", 15, 150.0, empresaRepository.buscarEmpresaPorId(1));
		Produto produto5 = new Produto(5, "Prato feito - Frango", 10, 25.0, empresaRepository.buscarEmpresaPorId(3));
		Produto produto6 = new Produto(6, "Prato feito - Carne", 10, 25.0, empresaRepository.buscarEmpresaPorId(3));
		Produto produto7 = new Produto(7, "Suco Natural", 30, 10.0, empresaRepository.buscarEmpresaPorId(3));
		Produto produto8 = new Produto(8, "Sonho", 5, 8.50, empresaRepository.buscarEmpresaPorId(2));
		Produto produto9 = new Produto(9, "Croissant", 7, 6.50, empresaRepository.buscarEmpresaPorId(2));
		Produto produto10 = new Produto(10, "Ché Gelado", 4, 5.50, empresaRepository.buscarEmpresaPorId(2));
		this.produtoRepository.addProdutos(produto,produto2,produto3,produto4,produto5,produto6,produto7,produto8,produto9,produto10);
		
	}
	public List<Produto> listarProdutos(){
		return this.produtoRepository.getList();
	}
	

}
