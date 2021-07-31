package hotel.service;

import hotel.entity.CheckIn;
import hotel.entity.Room;

public class CheckInServiceImpl implements CheckInService{
    @Override
    public int insert(CheckIn checkIn) {
        return 0;
    }

    @Override
    public Room checkIn(CheckIn checkIn) {
        return null;
    }

    @Override
    public int delete(int checkInId) {
        return 0;
    }

    @Override
    public int update(CheckIn checkIn) {
        return 0;
    }

    @Override
    public int checkOut(String roomNumber) {
        return 0;
    }

    @Override
    public int updateByRoomNumber(String roomNumber) {
        return 0;
    }

    @Override
    public CheckIn selectById(int checkInId) {
        return null;
    }

    @Override
    public CheckIn selectAll() {
        return null;
    }
}
