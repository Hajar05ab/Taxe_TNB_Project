package ma.emsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.Dao;
import ma.emsi.entities.Taxes;
import ma.emsi.repositories.TaxesRep;

@Service
public class TaxesService implements Dao<Taxes>{
	
	@Autowired
	private TaxesRep taxesRep;

	@Override
	public Taxes save(Taxes object) {
		// TODO Auto-generated method stub
		return this.taxesRep.save(object);
	}

	@Override
	public Taxes update(Taxes object) {
		// TODO Auto-generated method stub
		return this.taxesRep.save(object);
	}

	@Override
	public void delete(Taxes object) {
		// TODO Auto-generated method stub
		this.taxesRep.delete(object);
	}

	@Override
	public Taxes findById(int id) {
		// TODO Auto-generated method stub
		return this.taxesRep.findById(id);
	}

	@Override
	public List<Taxes> findAll() {
		// TODO Auto-generated method stub
		return this.taxesRep.findAll();
	}
	
	

}
