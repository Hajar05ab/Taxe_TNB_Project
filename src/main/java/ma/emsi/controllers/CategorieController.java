package ma.emsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Categorie;
import ma.emsi.services.CategorieService;

@RestController
@RequestMapping(value = "/api/categories")
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	@PostMapping(value = "/save")
	public Categorie save(Categorie object) {
		return categorieService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Categorie update(Categorie object) {
		return categorieService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Categorie object) {
		categorieService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Categorie findById(int id) {
		return categorieService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}
	
	
	

}
