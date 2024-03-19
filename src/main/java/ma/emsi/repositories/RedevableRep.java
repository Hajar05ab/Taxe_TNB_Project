package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.entities.Redevable;



@Repository
public interface RedevableRep extends JpaRepository<Redevable, Integer> {
	public Redevable findById(int id);

}
