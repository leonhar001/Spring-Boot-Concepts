package leonhar001.github.sbexercices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import leonhar001.github.sbexercices.model.entities.Client;

@RestController

/*@RequestMapping can be used to define a default path*/
@RequestMapping(path = "/clients")
public class ClientController {

	/*In this case the path becomes: /clients/any*/
	@GetMapping(path = "/any")
	public Client getClient() {
		return new Client(1, "Leonardo", "043074321-90");
	}
	/*Client's data are show as a JSON format*/
	
	
	/*A way to receive parameters from web server (from url)
	 * Example: https://localhost:8080/clients/1*/
	@GetMapping("/{id}")
	public Client getClientById1(@PathVariable int id) {
		return new Client(id, "João", "666666666-00");
	}
	
	
	/*Another way to receive parametes
	 * Example: https://localhost:8080/clients?id=1*/
	@GetMapping
	public Client getClientById2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Client(id, "Romário", "333333336-00");
	}
}
