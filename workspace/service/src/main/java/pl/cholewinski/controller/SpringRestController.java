package pl.cholewinski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.cholewinski.dao.PersonDAO;

@RestController
@RequestMapping("/hello")
public class SpringRestController {

	@Autowired
	private PersonDAO personDao;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}

}
