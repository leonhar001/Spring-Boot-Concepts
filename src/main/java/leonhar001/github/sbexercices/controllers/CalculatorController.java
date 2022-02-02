package leonhar001.github.sbexercices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

	@GetMapping("/sum/{x}/{y}")
	public int sum(@PathVariable int x, @PathVariable int y) {
		return (x+y);
	}
	
	@GetMapping("/sub")
	public int sub(
			@RequestParam(name = "a") int a,
			@RequestParam(name = "b") int b) {
		return (a-b);
	}
	
}
