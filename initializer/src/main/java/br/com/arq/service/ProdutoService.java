package br.com.arq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arq.model.Produto;
import br.com.arq.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Object save(Produto produto) throws Exception {
		try {
			Produto resp = produtoRepository.save(produto);
			if(resp==null) {
				throw new Exception("produto inexistente");
			}
			return resp;
			
		}catch(Exception ex) {
			throw new Exception("error:" + ex.getMessage());
			
		}
		
	}

}
