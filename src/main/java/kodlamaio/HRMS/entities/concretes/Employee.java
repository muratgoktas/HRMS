package kodlamaio.HRMS.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlamaio.HRMS.entities.abstracts.Person;

@Entity
@Table(name="Employees", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })

public class Employee extends Person {

	@Id
	@Column(name = "id")
	private int id;

	@OneToOne(mappedBy = "employee",cascade=CascadeType.ALL)
	private Person person;

	@Column(name = "salary")
	private double salary;
	
	
}
