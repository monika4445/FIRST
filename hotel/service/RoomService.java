package hotel.service;

import hotel.entity.Room;
import hotel.entity.RoomType;

public interface RoomService {
    int insert(Room room);

    int delete(int roomId);

    int update(Room room);

    RoomType selectById(int roomId);

    Room selectByNumber(String roomNumber);

    int selectByStatus(int roomStatus);

    int selectByType(int typeId);

    int selectAll();

    int orderRoom(int typeId);

    int inRoom(int typeId);

    int outRoom(int typeId);
}
