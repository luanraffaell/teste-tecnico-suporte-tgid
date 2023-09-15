package repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import testdev.Produto;

public class ProdutoRepository {
	private static ProdutoRepository INSTANCE = null;
	private List<Produto> produtos = new ArrayList<>();
	
	private ProdutoRepository() {
	}
	
	public List<Produto> getList(){
		return this.produtos;
	}
	public void addProduto(Produto produto){
		this.produtos.add(produto);
	}
	public void addProdutos(Produto...produtos) {
		Arrays.stream(produtos).forEach(p -> addProduto(p));
	}
	
	public static ProdutoRepository getInstance(){
		if(INSTANCE == null) {
			return new ProdutoRepository();
		}
		return INSTANCE;
	}

}
