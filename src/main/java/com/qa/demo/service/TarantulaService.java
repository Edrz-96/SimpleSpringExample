package com.qa.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.qa.demo.domain.Tarantula;
import com.qa.demo.repo.TarantulaRepo;

@Service
public class TarantulaService {

	// Dependency
	private TarantulaRepo repo;

	public TarantulaService(TarantulaRepo repo) {
		this.repo = repo;
	}

	// Manual version

	// Read
	public List<Tarantula> read() {
		List<Tarantula> list = Arrays.asList(
				new Tarantula(15, "Terestrial", true, "Moody", "Hot", "Grammostola", "Rose"),
				new Tarantula(20, "Terestrial", true, "Moody", "Hot", "Grammostola", "Rose"));
		return list;
	}

	// Notice how much easier it gets when we're able to use repo methods?

	// Read all
	public List<Tarantula> getAll() {
		return this.repo.findAll();
	}

	// Update
	public Tarantula update(Long id, Tarantula t) {
		Tarantula existing = this.repo.getById(id);
		existing.setCommonName(t.getCommonName()); // Set field with new input
		existing.setDimorphism(t.isDimorphism());
		existing.setGenus(t.getGenus());
		existing.setClimate(t.getClimate());
		existing.setLegSpan(t.getLegSpan());
		existing.setTemperament(t.getTemperament());
		existing.setHabitat(t.getHabitat());
		Tarantula updated = this.repo.save(existing); // Overwrite the obj
		return updated;
	}

	// Create
	public Tarantula create(Tarantula t) {
		return this.repo.saveAndFlush(t);
	}

	// Delete
	public Boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}

	// Get id
	public Tarantula getById(Long id) {
		final Tarantula found = this.repo.findById(id).orElseThrow(() -> {
			return new ResponseStatusException(HttpStatus.NOT_FOUND, "No resource found");
		});
		return found;
	}
}