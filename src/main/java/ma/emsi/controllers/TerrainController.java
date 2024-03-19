package ma.emsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Terrain;
import ma.emsi.services.TerrainService;

@RestController
@RequestMapping(value = "/api/terrains")
public class TerrainController {
	
	@Autowired
	private TerrainService terrainService;
	
	@PostMapping(value = "/save")
	public Terrain save(Terrain object) {
		return terrainService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Terrain update(Terrain object) {
		return terrainService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Terrain object) {
		terrainService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Terrain findById(int id) {
		return terrainService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Terrain> findAll() {
		return terrainService.findAll();
	}
	
	

}
