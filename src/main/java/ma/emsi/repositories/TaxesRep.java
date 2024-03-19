package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.entities.Taxes;



@Repository
public interface TaxesRep extends JpaRepository<Taxes, Integer>{
	public Taxes findById(int id);

}
