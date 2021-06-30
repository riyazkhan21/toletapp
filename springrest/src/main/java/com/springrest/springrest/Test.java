package com.springrest.springrest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Cource;
import com.springrest.springrest.services.CourcesService;

@RestController
public class Test {

	@Autowired
	private CourcesService courcesService;

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Cources";
	}

	// ger cources
	@GetMapping("/cources")
	public List<Cource> getCources() {

		return this.courcesService.getCources();
	}

	// get single course
	@GetMapping("/cources/{id}")
	public Cource getCource(@PathVariable String id) {

		return this.courcesService.getCourse(Long.parseLong(id));
	}

	// add new course
	@PostMapping(path = "/cources", consumes = "application/json")
	public Cource addCource(@Valid @RequestBody Cource cource) {

		return this.courcesService.addcourse(cource);
	}
}
