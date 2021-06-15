package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobseekers")
@NoArgsConstructor
@AllArgsConstructor
public class Jobseeker {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="sector_id" )
		private int sectorId;
		
		@Column(name="client_id")
		private int clientId;
		
		@Column(name="job_position_id")
		private int jopPositionId;
		
}
