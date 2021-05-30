package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;
// Anatasyon: çalışma anında class hakkında bilgi toplam . 
// Classın hangi katmana denk geldiğini gösterir.
// Aşağıdaki uygulama şekli var. Spring için anatasyonu
// C#  attribitudt demek. 
//lombakın get ve setleri getirmesi için.
// Spring için anatasyon yapıyıyor IEntity gibi.
//@Data   
@Entity
@Table(name="customers")
public class Customer extends User{

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="subscriberId")
	private int subscriberId;
	
	//private String companyNo;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="taxNumber")
	private String taxNumber;
	
	@Column(name="taxName")
	private String taxName;
	
	
	public Customer() {

	}
	public Customer(int userId,int subscriberId,String companyName, String taxNumber, String taxName) {
		super();
		this.userId=userId;
		this.subscriberId=subscriberId;
		this.companyName = companyName;
	//	this.companyNo=companyName.substring(0, 1)+"-"+userId;
		this.taxNumber = taxNumber;
		this.taxName = taxName;
	}
}
