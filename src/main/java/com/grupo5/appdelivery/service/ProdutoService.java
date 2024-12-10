package com.grupo5.appdelivery.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.grupo5.appdelivery.model.Produto;
import com.grupo5.appdelivery.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Optional<Produto> cadastrarProduto(Produto produto) {

		if (produtoRepository.findByNome(produto.getNome()).isPresent())
			return Optional.empty();

		return Optional.of(produtoRepository.save(produto));
	}

	public Optional<Produto> atualizarProduto(Produto produto) {

		if (produtoRepository.findById(produto.getId()).isPresent()) {

			Optional<Produto> buscaProduto = produtoRepository.findByNome(produto.getNome());

			if (buscaProduto.isPresent() && !buscaProduto.get().getId().equals(produto.getId()))
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produto já existe!", null);

			return Optional.of(produtoRepository.save(produto));
		}

		return Optional.empty();
	}

	public Optional<Produto> buscarProdutoPorId(Long id) {
		return produtoRepository.findById(id);
	}

	public void deletarProduto(Long id) {
		if (produtoRepository.findById(id).isPresent()) {
			produtoRepository.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado!");
		}
	}

	public List<Produto> recomendarProdutosSaudaveis() {
		List<Produto> todosProdutos = produtoRepository.findAll();

		return todosProdutos.stream().filter(produto -> produto.getCategoria() != null
				&& "saudável".equalsIgnoreCase(produto.getCategoria().getCategoria())).collect(Collectors.toList());
	}

}