package hotel.entity;

public class Food {
    public int foodId;
    public String foodName;
    public int price;
    public String ingredient;

    public Food() {
    }

    public Food(int foodId, String foodName, int price, String ingredient) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.ingredient = ingredient;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
