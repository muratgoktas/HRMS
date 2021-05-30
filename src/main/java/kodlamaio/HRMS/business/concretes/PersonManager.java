package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.PersonService;
import kodlamaio.HRMS.dataAccess.abstracts.PersonDao;
import kodlamaio.HRMS.entities.concretes.Person;

@Service
public class PersonManager implements PersonService{
	
	private PersonDao personDao;
	@Autowired
	public PersonManager(PersonDao personDao) {
		super();
		this.personDao=personDao;
	}
	@Override
	public List<Person> getAll() {
		
		// Parametre vermediğimiz için bütün dataları getirir.
		return this.personDao.findAll();
	}

}
