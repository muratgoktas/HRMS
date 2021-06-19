package kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlamaio.HRMS.entities.abstracts.EducationInformationsTitle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EducationInformationsDetail", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")})
@AllArgsConstructor
@NoArgsConstructor

public class EducationInformationsDetail extends EducationInformationsTitle  {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="educationId")
	private int educationId;
	
	@Column(name="cityId")
	private String cityId;
	
	@Column(name="startingDate")
	private Date startingDate;
	
	@Column(name="endingDate")
	private Date endingDate;
	
	
	
	
}
