package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Employee")
@Table(name="Employees") //, uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Employee extends Person {

	@Column(name = "salary")
	private double salary;
	
	
}
