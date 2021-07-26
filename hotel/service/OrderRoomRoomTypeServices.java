package hotel.service;

import hotel.entity.*;

public class OrderRoomRoomTypeServices implements OrderService, RoomService, RoomTypeService {
    @Override
    public int insert(Order order) {
        return 0;
    }

    @Override
    public int addOrder(Order order) {
        return 0;
    }

    @Override
    public int delete(Integer orderId) {
        return 0;
    }

    @Override
    public Order selectById(Integer orderId) {
        return null;
    }

    @Override
    public Order selectByNameAndPhone(String name, String phone) {
        return null;
    }

    @Override
    public int update(Order record) {
        return 0;
    }

    @Override
    public int payOrder(int orderId) {
        return 0;
    }

    @Override
    public int cancelOrder(int orderId) {
        return 0;
    }

    @Override
    public Integer getOrderCount() {
        return null;
    }


    @Override
    public int insert(Room room) {
        return 0;
    }

    @Override
    public int delete(int roomId) {
        return 0;
    }

    @Override
    public int insert(RoomType roomType) {
        return 0;
    }

    @Override
    public int update(RoomType roomType) {
        return 0;
    }

    @Override
    public RoomType selectByName(String roomType) {
        return null;
    }

    @Override
    public int update(Room room) {
        return 0;
    }

    @Override
    public RoomType selectById(int roomId) {
        return null;
    }

    @Override
    public int findAllType() {
        return 0;
    }

    @Override
    public int updateRest(int typeId, int num) {
        return 0;
    }

    @Override
    public int addRest(int typeId) {
        return 0;
    }

    @Override
    public int minusRest(int typeId) {
        return 0;
    }

    @Override
    public int findAllRestType() {
        return 0;
    }

    @Override
    public Room selectByNumber(String roomNumber) {
        return null;
    }

    @Override
    public int selectByStatus(int roomStatus) {
        return 0;
    }

    @Override
    public int selectByType(int typeId) {
        return 0;
    }

    @Override
    public int selectAll() {
        return 0;
    }

    @Override
    public int orderRoom(int typeId) {
        return 0;
    }

    @Override
    public int inRoom(int typeId) {
        return 0;
    }

    @Override
    public int outRoom(int typeId) {
        return 0;
    }
}
