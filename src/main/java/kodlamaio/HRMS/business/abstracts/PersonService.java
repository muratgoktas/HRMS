package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.Person;

public interface PersonService {
	List<Person> getAll();
}
