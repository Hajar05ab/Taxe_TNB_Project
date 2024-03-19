package ma.emsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.Dao;
import ma.emsi.entities.Taux;
import ma.emsi.repositories.TauxRep;

@Service
public class TauxService implements Dao<Taux> {
	
	@Autowired
	private TauxRep tauxRep;

	@Override
	public Taux save(Taux object) {
		// TODO Auto-generated method stub
		return this.tauxRep.save(object);
	}

	@Override
	public Taux update(Taux object) {
		// TODO Auto-generated method stub
		return this.tauxRep.save(object);
	}

	@Override
	public void delete(Taux object) {
		// TODO Auto-generated method stub
		this.tauxRep.delete(object);
	}

	@Override
	public Taux findById(int id) {
		// TODO Auto-generated method stub
		return this.tauxRep.findById(id);
	}

	@Override
	public List<Taux> findAll() {
		// TODO Auto-generated method stub
		return this.tauxRep.findAll();
	}
	
	

}
