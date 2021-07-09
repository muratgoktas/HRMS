package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anatasyon: çalışma anında class hakkında bilgi toplam . 
//Classın hangi katmana denk geldiğini gösterir.
//Aşağıdaki uygulama şekli var. Spring için anatasyonu
//C#  attribitudt demek. 

//----------- Java için güzel kaynak ----------------------
//
//            https://howtodoinjava.com/
//
// --------------------------------------------------------

@Data // lombakın get ve setleri getirmesi için.

@Entity(name = "User") // Spring IEntity yerine bunu kullanıyor artık.
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Users")

public  class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id nin otomatik artaşağını söyler.
	private Integer id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "active")
	private boolean active;

	@Column(name = "rol")
	private int rol;

}
