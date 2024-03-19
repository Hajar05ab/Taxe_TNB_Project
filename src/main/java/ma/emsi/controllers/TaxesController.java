package ma.emsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Taxes;
import ma.emsi.services.TaxesService;

@RestController
@RequestMapping(value = "/api/taxes")
public class TaxesController {
	@Autowired
	private TaxesService taxesService;
	
	@PostMapping(value = "/save")
	public Taxes save(Taxes object) {
		return taxesService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Taxes update(Taxes object) {
		return taxesService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Taxes object) {
		taxesService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Taxes findById(int id) {
		return taxesService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Taxes> findAll() {
		return taxesService.findAll();
	}
	
	

}
