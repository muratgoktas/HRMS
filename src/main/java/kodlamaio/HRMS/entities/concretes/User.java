package kodlamaio.HRMS.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//Anatasyon: çalışma anında class hakkında bilgi toplam . 
//Classın hangi katmana denk geldiğini gösterir.
//Aşağıdaki uygulama şekli var. Spring için anatasyonu
//C#  attribitudt demek. 

@Entity // Spring IEntity yerine bunu kullanıyor artık.
@Table(name="Users") 
@Data  //lombakın get ve setleri getirmesi için.
public class User {

	@Id
	@GeneratedValue // Id nin otomatik artaşağını söyler.
	@Column(name="id")
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public User() {
		
	}
	public User(int id, String userName, String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
}
