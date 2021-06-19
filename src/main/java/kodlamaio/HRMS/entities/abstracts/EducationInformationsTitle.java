package kodlamaio.HRMS.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EducationInformationsTitle", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")})

@AllArgsConstructor
@NoArgsConstructor
public class EducationInformationsTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="educationName")
	private String educationName;
	
	public  enum EnumEducationLevel {

	    HighSchool,
	    University,
	    Bachelor,
	    Master,
	    Postgraduate;

		@Column(name="educationLevel")
		private String ecducationLevel;
	 
	    public String getEducationLevel() {
	        return ecducationLevel;
	    }
	
	}
    
	
	
	
}
