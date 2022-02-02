package leonhar001.github.sbexercices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	/*
	 * Default method when calling @RequestMapping -> GET (http method) That is:
	 * @RequestMapping(method = RequestMethod.GET) equals only calling
	 * @RequestMapping
	 * 
	 */

	@RequestMapping(method = RequestMethod.GET)
	public String returnHi() {
		return "Really? Hello? Again?\nNo...it's Hi ;-)";
	}

	/*
	 * Using path="/example" is possible to define the exact path on site's url.
	 * Example:
	 */

	@RequestMapping(method = RequestMethod.GET, path = "/hi")
	public String returnHiPath() {
		return "Really? Hello? Again?\nNo...it's Hi...WITH 'PATH';-)";
	}
}
