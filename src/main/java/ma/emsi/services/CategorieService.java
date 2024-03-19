package ma.emsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.Dao;
import ma.emsi.entities.Categorie;
import ma.emsi.repositories.CategorieRep;

@Service
public class CategorieService implements Dao<Categorie> {
	
	@Autowired
	private CategorieRep categorieRep;

	@Override
	public Categorie save(Categorie object) {
		// TODO Auto-generated method stub
		return this.categorieRep.save(object);
	}

	@Override
	public Categorie update(Categorie object) {
		// TODO Auto-generated method stub
		return this.categorieRep.save(object);
	}

	@Override
	public void delete(Categorie object) {
		// TODO Auto-generated method stub
		this.categorieRep.delete(object);
	}

	@Override
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		return this.categorieRep.findById(id);
	}

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return this.categorieRep.findAll();
	}
	

}
