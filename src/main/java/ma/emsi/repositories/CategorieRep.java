package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.entities.Categorie;



@Repository
public interface CategorieRep extends JpaRepository<Categorie, Integer> {
	public Categorie findById(int id);

}
