package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="jobseeker")
@Table(name="jobseekers") //, uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Jobseeker extends Person {
		
		
		@Column(name="sector_id" )
		private int sectorId;
		
		@Column(name="client_id")
		private int clientId;
		
		@Column(name="job_position_id")
		private int jopPositionId;
		
}
