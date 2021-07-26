package hotel.service;

import hotel.entity.Food;

public interface FoodService {
    void deleteFood(String foodId);
    void saveFood(String foodName, String price);
    void updateFood(String foodId, String foodName, String price);


}
