package br.gov.rj.faeterj.estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rj.faeterj.estoque.model.Produto;
import br.gov.rj.faeterj.estoque.repository.Produtos;

@Service // Trata-se de um Componente @Component, um serviço referente a regras de negócio
public class CadastroProdutoService {
	@Autowired // Indica que será injetado o repositório de produtos (linha 8)
	private Produtos produtos; // Repositório de produtos, necessário para salvar o produto
	
	@Transactional // Abre o controle de transação quando for executar o método salvar
	public void salvar(Produto produto) {
		produtos.save(produto); // no repositório produtos
	}

} // Esta classe CadastroProdutoService deverá ser injetada na classe ProdutosController.java
  // Abra a classe ProdutosController.java e veja a seguinte referência:
  //      @Autowired
  //      private CadastroProdutoService cadastroProdutoService;
  // Com isto será possível implementar a gravação de produtos na classe ProdutosController:
  //      cadastroProdutoService.salvar(produto); 
