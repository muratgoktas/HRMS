package kodlamaio.HRMS.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlamaio.HRMS.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity()// USERDAN GELDIGI ICIN KALDIRDIK(name = "ForeignKeyAssoAccountEntity")
@Table(name = "Customers", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")})

@AllArgsConstructor
@NoArgsConstructor
// source documents :https://howtodoinjava.com/hibernate/hibernate-one-to-one-mapping/
public class Customer extends User {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	private User user;
	
	@Column(name = "companyName")
	private String companyName;

	@Column(name = "taxNumber")
	private String taxNumber;

	@Column(name = "taxName")
	private String taxName;

	@ManyToOne
	private Subscriber subscriber;

}
