package hotel.service;

import hotel.entity.RoomType;

public interface RoomTypeService {

    int insert(RoomType roomType);

    int delete(int typeId);

    int update(RoomType roomType);

    RoomType selectByName(String roomType);

    RoomType selectById(int typeId);

    int findAllType();

    int updateRest(int typeId, int num);

    int addRest(int typeId);

    int minusRest(int typeId);

    int findAllRestType();
}
