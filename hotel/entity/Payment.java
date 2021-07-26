package hotel.entity;

public class Payment {
    private long id;

    private String title;

    private String paymentType;

    private String price;

    private String currency;

    private String explanation;

    private String roomNumber;

    private String dateTime;

    public Payment() {
    }

    public Payment(long id, String title,
                   String paymentType, String price, String currency, String explanation,
                   String roomNumber, String dateTime) {
        this.id = id;
        this.title = title;
        this.paymentType = paymentType;
        this.price = price;
        this.currency = currency;
        this.explanation = explanation;
        this.roomNumber = roomNumber;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", price='" + price + '\'' +
                ", currency='" + currency + '\'' +
                ", explanation='" + explanation + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
