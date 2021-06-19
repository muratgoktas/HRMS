package kodlamaio.HRMS.entities.abstracts;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlamaio.HRMS.entities.concretes.Customer;
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

@Entity(name = "ForeignKeyAssoAccountEntity") // Spring IEntity yerine bunu kullanıyor artık.
@Table(name = "Users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")})

@AllArgsConstructor
@NoArgsConstructor

public abstract class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id nin otomatik artaşağını söyler.
	@Column(name = "id")
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Person person;

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
