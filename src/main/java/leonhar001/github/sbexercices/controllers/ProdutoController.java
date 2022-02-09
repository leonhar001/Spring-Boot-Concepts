package leonhar001.github.sbexercices.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import leonhar001.github.sbexercices.model.entities.Product;
import leonhar001.github.sbexercices.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProdutoController {
	
	@Autowired
	private ProductRepository productRepository;
	/*
	//RECEIVING EACH PARAM VIA POST INDIVIDUALLY
	@PostMapping
	public Product newProduct(@RequestParam String name,
			@RequestParam Double price,
			@RequestParam Double discount) {
		Product product = new Product(name, price, discount);
		productRepository.save(product);
		return product;
	}
	*/
	/*MORE DIRECT WAY*/
	@RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Product newProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@GetMapping
	public Iterable<Product> getProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/name/{search}")
	public Iterable<Product> getProductsByName(@PathVariable String search){
		return productRepository.findByNameContaining(search);
	}
	
	@GetMapping(path = "/page/{pageN}/{qnt}")
	public Iterable<Product> getProductsPaging(@PathVariable int pageN , @PathVariable int qnt){
		qnt = qnt >= 3 ? 3 : qnt;
		Pageable page = PageRequest.of(pageN, qnt);
		return productRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Product> getProducsById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@PutMapping
	public @ResponseBody Product alterProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
}
