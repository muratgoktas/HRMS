package kodlamaio.HRMS.entities.abstracts;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlamaio.HRMS.entities.concretes.Employee;
import kodlamaio.HRMS.entities.concretes.Jobseeker;

@Entity()//(name = "ForeignKeyAssoAccountEntity")
@Table(name = "Persons", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })

public class Person extends User {

	@Id
	@Column(name = "id")
	private int id;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Employee employee;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Jobseeker jobseeker;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "identification")
	private String nationalIdentity;

	@Column(name = "birthdate")
	private Date birthdate;

}
