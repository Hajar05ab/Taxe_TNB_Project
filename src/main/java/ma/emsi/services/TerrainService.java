package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.Dao;
import ma.emsi.entities.Terrain;
import ma.emsi.repositories.TerrainRep;


@Service
public class TerrainService implements Dao<Terrain> {
	
	@Autowired
	private TerrainRep terrainRep;

	@Override
	public Terrain save(Terrain object) {
		// TODO Auto-generated method stub
		return this.terrainRep.save(object);
	}

	@Override
	public Terrain update(Terrain object) {
		// TODO Auto-generated method stub
		return this.terrainRep.save(object);
	}

	@Override
	public void delete(Terrain object) {
		// TODO Auto-generated method stub
		this.terrainRep.delete(object);
	}

	@Override
	public Terrain findById(int id) {
		// TODO Auto-generated method stub
		return this.terrainRep.findById(id);
	}

	@Override
	public List<Terrain> findAll() {
		// TODO Auto-generated method stub
		return this.terrainRep.findAll();
	}
	
	

}
