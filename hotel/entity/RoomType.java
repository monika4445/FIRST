package hotel.entity;

import java.util.Date;

public class RoomType {
    private int typeId;

    private String roomType;

    private String remark;

    private double price;

    private double discount;

    private int area;

    private int bedNum;

    private String bedSize;

    private int window;

    private int rest;
    private Date createTime;

    private Date updateTime;

    public RoomType(int typeId, String roomType, String remark, double price, double discount, int area,
                    int bedNum, String bedSize, int window, int rest, Date createTime, Date updateTime) {
        this.typeId = typeId;
        this.roomType = roomType;
        this.remark = remark;
        this.price = price;
        this.discount = discount;
        this.area = area;
        this.bedNum = bedNum;
        this.bedSize = bedSize;
        this.window = window;
        this.rest = rest;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBedNum() {
        return bedNum;
    }

    public void setBedNum(int bedNum) {
        this.bedNum = bedNum;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "typeId=" + typeId +
                ", roomType='" + roomType + '\'' +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", area=" + area +
                ", bedNum=" + bedNum +
                ", bedSize='" + bedSize + '\'' +
                ", window=" + window +
                ", rest=" + rest +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
