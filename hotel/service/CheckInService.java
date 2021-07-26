package hotel.service;

import hotel.entity.CheckIn;
import hotel.entity.Room;

public interface CheckInService {
    int insert(CheckIn checkIn);

    Room checkIn(CheckIn checkIn);

    int delete(int checkInId);

    int update(CheckIn checkIn);

    int checkOut(String roomNumber);

    int updateByRoomNumber(String roomNumber);

    CheckIn selectById(int checkInId);

    CheckIn selectAll();
}
