package kodlamaio.HRMS.entities.concretes;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.UniqueConstraint;
import java.util.Set;

@Data
@Entity(name = "ForeignKeyAssoEntity")
@Table(name = "Subscribers", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })

public class Subscriber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="subscriber_id")
	private Set<Customer> customers;
	
	
}
