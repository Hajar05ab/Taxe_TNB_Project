package ma.emsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Redevable;
import ma.emsi.services.RedevableService;

@RestController
@RequestMapping(value = "/api/redevables")
public class RedevableController {
	@Autowired
	private RedevableService redevableService;
	
	@PostMapping(value = "/save")
	public Redevable save(Redevable object) {
		return redevableService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Redevable update(Redevable object) {
		return redevableService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Redevable object) {
		redevableService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Redevable findById(int id) {
		return redevableService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Redevable> findAll() {
		return redevableService.findAll();
	}
	
	

}
