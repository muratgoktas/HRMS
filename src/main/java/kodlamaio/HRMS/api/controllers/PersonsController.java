package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.PersonService;
import kodlamaio.HRMS.entities.concretes.Person;

// Dış dünyanın sistemimizle ilişki kurdu yer. 
//andrioid, angller react tek çatı altında controller ile birleşir.
@RestController
@RequestMapping("/api/persons")
//kodlama.io/api/persons
public class PersonsController {

	private PersonService personService;

	@Autowired
	public PersonsController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@GetMapping("/getAll") // Veri istediği için
	public List<Person> getAll() {
		return this.personService.getAll();
	}
}
