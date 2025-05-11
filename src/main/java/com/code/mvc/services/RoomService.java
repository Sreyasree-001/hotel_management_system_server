package com.code.mvc.services;

import com.code.mvc.models.Customer;
import com.code.mvc.models.Room;
import com.code.mvc.repositories.RoomRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class RoomService implements RoomServiceInterface{
    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room){
        return roomRepository.save(room);
    }
    @Override
    public Room updateRoom(long id, Room room) {
        Optional<Room> existing = roomRepository.findById(id);
        if (existing.isPresent()) {
            room.setRoomId(id);
            return roomRepository.save(room);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteRoom(long id){
        Optional<Room> room = roomRepository.findById(id);
        if(room.isPresent()){
            Room r = room.get();
            //delete
            roomRepository.delete(r);
            return true;
        }
        else{
        }
        return false;
    }
    @Override
    public Optional<Room> getRoomById(long id) {
        return roomRepository.findById(id);
    }

    @Override
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

}
