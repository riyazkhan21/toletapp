package com.tolet.toletapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tolet.toletapp.entity.Room;
import com.tolet.toletapp.repository.RoomRepository;

@Service
public class RoomServiceImpl {

	@Autowired
	RoomRepository repository;


	public List<Room> getRooms() {
		return repository.findAll();
	}


	public Room getRoom(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Room addRoom(Room room) {

		// roomDao.save(room);
		return null;
	}
}
