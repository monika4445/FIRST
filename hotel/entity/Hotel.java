package hotel.entity;

public class Hotel {
    public int hotelId;

    public String hotelName;

    public int phone;

    public String email;

    public String address;

    public String website;

    public int createTime;

    public int updateTime;
    public int starCount;
    public String Owner;

    public Hotel() {
    }

    public Hotel(int hotelId, String hotelName, int phone,
                 String email, String address, String website,
                 int createTime, int updateTime, int starCount, String owner) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.website = website;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.starCount = starCount;
        Owner = owner;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", starCount=" + starCount +
                ", Owner='" + Owner + '\'' +
                '}';
    }
}
