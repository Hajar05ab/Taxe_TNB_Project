package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.entities.Terrain;



@Repository
public interface TerrainRep extends JpaRepository<Terrain, Integer> {
	public Terrain findById(int id);

}
