package ma.emsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.Dao;
import ma.emsi.entities.Redevable;
import ma.emsi.repositories.RedevableRep;


@Service
public class RedevableService implements Dao<Redevable> {
	@Autowired
	private RedevableRep redevableRep;

	@Override
	public Redevable save(Redevable object) {
		// TODO Auto-generated method stub
		return this.redevableRep.save(object);
	}

	@Override
	public Redevable update(Redevable object) {
		// TODO Auto-generated method stub
		return this.redevableRep.save(object);
	}

	@Override
	public void delete(Redevable object) {
		// TODO Auto-generated method stub
		this.redevableRep.delete(object);
	}

	@Override
	public Redevable findById(int id) {
		// TODO Auto-generated method stub
		return this.redevableRep.findById(id);
	}

	@Override
	public List<Redevable> findAll() {
		// TODO Auto-generated method stub
		return this.redevableRep.findAll();
	}
	

	
	
	
	
	
	

}
