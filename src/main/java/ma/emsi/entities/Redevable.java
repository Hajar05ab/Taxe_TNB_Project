package ma.emsi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Redevable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String nom;
	private String prenom;
	private String cin;
	@OneToMany
	private List<Terrain> terrain;
	@OneToMany
	private List<Taxes> taxes;
	

}
