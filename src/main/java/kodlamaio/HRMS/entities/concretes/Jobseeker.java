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
@Table(name="jobseekers", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })

public class Jobseeker extends Person {
		
		@Id
		@Column(name="id")
		private int id;
		
		@OneToOne(mappedBy = "jobseeker",cascade=CascadeType.ALL)
		private Person person;
		
		@Column(name="sector_id" )
		private int sectorId;
		
		@Column(name="client_id")
		private int clientId;
		
		@Column(name="job_position_id")
		private int jopPositionId;
		
}
