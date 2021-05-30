package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{
// bu sayede CRUD operasyonları hazır olarak JpaRepository'den geldi. 
}
