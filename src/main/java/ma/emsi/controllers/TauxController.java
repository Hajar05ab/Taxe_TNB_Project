package ma.emsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Taux;
import ma.emsi.services.TauxService;

@RestController
@RequestMapping(value = "/api/taux")
public class TauxController {
	@Autowired
	private TauxService tauxService;
	
	@PostMapping(value = "/save")
	public Taux save(Taux object) {
		return tauxService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Taux update(Taux object) {
		return tauxService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Taux object) {
		tauxService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Taux findById(int id) {
		return tauxService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Taux> findAll() {
		return tauxService.findAll();
	}
	
	

}
