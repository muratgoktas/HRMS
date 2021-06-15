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
//Anatasyon: çalışma anında class hakkında bilgi toplam . 
//Classın hangi katmana denk geldiğini gösterir.
//Aşağıdaki uygulama şekli var. Spring için anatasyonu
//C#  attribitudt demek. 

@Data  //lombakın get ve setleri getirmesi için.

@Entity // Spring IEntity yerine bunu kullanıyor artık.

@Table(name="Users") 
@AllArgsConstructor
@NoArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id nin otomatik artaşağını söyler.
	@Column(name="id")
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="rol")
	private int rol;
	//  private ZonedDateTime birthDate;

	
	
}
