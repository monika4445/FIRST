package hotel.entity;

public class Food {
    public String foodId;
    public String foodName;
    public String price;
    public String ingredient;

    public Food() {
    }

    public Food(String foodId, String foodName, String price, String ingredient) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.ingredient = ingredient;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
