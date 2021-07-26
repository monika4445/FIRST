package hotel.service;

import hotel.entity.Hotel;
import hotel.entity.RoomType;

public interface HotelService {

    int insert(Hotel hotel);
    int delete(int hotelId);
    int update(Hotel hotel);
    RoomType selectByName(String hotelName);
    RoomType selectById(int hotelId);
    Hotel selectAll();
}
