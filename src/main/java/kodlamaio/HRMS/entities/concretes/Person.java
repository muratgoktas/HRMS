package kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity(name = "Person")
//@Table(name = "Persons", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class Person extends User {

	/*
	 * @Id
	 * 
	 * @Column(name = "id") private int id;
	 */

	/*
	 * @OneToOne(cascade = CascadeType.ALL) private User user;
	 */

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @PrimaryKeyJoinColumn private Employee employee;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @PrimaryKeyJoinColumn private Jobseeker jobseeker;
	 */

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "identification")
	private String nationalIdentity;

	@Column(name = "birthdate")
	private Date birthdate;

}
