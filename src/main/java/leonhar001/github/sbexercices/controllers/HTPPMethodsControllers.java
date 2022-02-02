package leonhar001.github.sbexercices.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/methods")
public class HTPPMethodsControllers {

	@GetMapping
	public String get() {
		return "GET METHOD";
	}
	
	@PostMapping
	public String post() {
		return "POST METHOD";
	}
	
	@PutMapping
	public String put() {
		return "PUT METHOD";
	}
	
	@PatchMapping
	public String patch() {
		return "PATCH METHOD";
	}
	
	@DeleteMapping
	public String delete() {
		return "DELETE METHOD";
	}
	
}
