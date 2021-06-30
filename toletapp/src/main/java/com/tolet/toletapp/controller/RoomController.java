package com.tolet.toletapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tolet.toletapp.entity.Room;
import com.tolet.toletapp.service.RoomServiceImpl;

@RestController
public class RoomController {

	
	@Autowired
	RoomServiceImpl serviceImpl;

	@RequestMapping("/room")
	public List<Room> getRooms() {
		
		return serviceImpl.getRooms();
	}
}
