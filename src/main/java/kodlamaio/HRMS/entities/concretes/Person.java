package kodlamaio.HRMS.entities.concretes;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import lombok.Data;

//Anatasyon: çalışma anında class hakkında bilgi toplam . 
//Classın hangi katmana denk geldiğini gösterir.
//Aşağıdaki uygulama şekli var. Spring için anatasyonu
//C#  attribitudt demek. 

//@Data //lombakın get ve setleri getirmesi için.
@Entity // Spring için anatasyon yapıyıyor IEntity gibi.
@Table(name="persons")

public class Person extends User{

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
//	private String personNo;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="identification")
	private String identification;
	
	//private Date birthdate;
	
	
	public Person() {
		
	}
	
	public Person(int userId, String firstName, String lastName,String identification) {
		super();
		this.userId=userId;
	//	this.personNo = firstName.substring(0, 1)+"-"+userId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.birthdate=birthdate;
		
		this.identification = identification;
	}
	
}
