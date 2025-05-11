package com.code.mvc.services;

import com.code.mvc.models.Room;

import java.util.List;
import java.util.Optional;

public interface RoomServiceInterface {
    Room createRoom(Room room);
    Room updateRoom(long id, Room room);
    boolean deleteRoom(long id);
    Optional<Room> getRoomById(long id);
    List<Room> getAllRooms();
}
