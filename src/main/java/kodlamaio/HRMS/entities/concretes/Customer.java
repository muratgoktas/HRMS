package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Customer")
@Table(name = "Customers", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
@DiscriminatorValue("Customers")
@PrimaryKeyJoinColumn(name = "id")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
// source documents :https://howtodoinjava.com/hibernate/hibernate-one-to-one-mapping/
public class Customer {


	@OneToOne
	@MapsId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private User user;
	
	@Id
	@Column(name = "users_id", insertable = false, updatable = false)
	private Integer users_id;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "taxNumber")
	private String taxNumber;

	@Column(name = "taxName")
	private String taxName;
	/*
	 * @ManyToOne private Subscriber subscriber;
	 */

}
