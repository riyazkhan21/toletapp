package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Cource;

@Service
public class CourceServiceImp implements CourcesService {

	List<Cource> list;

	@Autowired
	private CourseDao courseDao;

	public CourceServiceImp() {

		// list = new ArrayList();
		// list.add(new Cource(342, "Python", "Backend tech"));
		// list.add(new Cource(5434, "Anguler", "Front End"));
	}

	@Override
	public List<Cource> getCources() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Cource getCourse(long id) {

		/*
		 * Cource cource = null;
		 * 
		 * for (Cource c : list) {
		 * 
		 * if (c.getId() == id) {
		 * 
		 * cource = c; break; } }
		 */
		return courseDao.getOne(id);
	}

	@Override
	public Cource addcourse(Cource cource) {

		// list.add(cource);
		courseDao.save(cource);
		return cource;
	}

}
