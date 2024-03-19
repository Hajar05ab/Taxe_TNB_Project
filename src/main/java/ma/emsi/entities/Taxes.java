package ma.emsi.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Taxes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String label;
	private String description;
	private Date tnbYear;
	private Double montantBase;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Taux taux;
	@ManyToOne
	private Terrain terrain;
	@ManyToOne
	private Redevable redevable;
	

}
