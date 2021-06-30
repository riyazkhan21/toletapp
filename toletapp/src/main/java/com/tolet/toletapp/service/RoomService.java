package com.tolet.toletapp.service;

import java.util.List;

import com.tolet.toletapp.entity.Room;

public interface RoomService {

	public List<Room> getRooms();
	
	public Room getRoom(long id); 
	
	public Room addRoom(Room room);
}
