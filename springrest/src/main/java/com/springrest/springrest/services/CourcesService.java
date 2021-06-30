package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Cource;

public interface CourcesService {

	public List<Cource> getCources();

	public Cource getCourse(long id);
	
	public Cource addcourse(Cource cource);
}
