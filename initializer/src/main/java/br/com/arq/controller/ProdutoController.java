package br.com.arq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.model.Produto;
import br.com.arq.service.ProdutoService;

@RestController
@RequestMapping("api/produtos")
@ResponseBody
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/gravarProduto")
	public ResponseEntity <Produto> gravarProduto(@RequestBody Produto prod) {
		try {
			 Produto produto = (Produto) produtoService.save(prod);
		     return ResponseEntity.ok(produto);
		   } catch(Exception ex) {
			   ex.printStackTrace();
			    
		   }
		return null;
		
		
		
	}
	
	
	

}
