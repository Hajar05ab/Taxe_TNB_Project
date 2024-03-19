package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.entities.Taux;



@Repository
public interface TauxRep extends JpaRepository<Taux, Integer> {
	public Taux findById(int id);

}
