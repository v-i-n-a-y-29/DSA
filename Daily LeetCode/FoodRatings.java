import java.util.*;

public class FoodRatings {
    // food->ratings
    // food->cuisine
    // cuisine ->[[food1,r1] , [food2,r2],...]
    // but we have to also arrange the food in ascending order therefore we will store like [rating,food] 
    //thus we will take a set {[r1,food1],[r2,food2],....]} and it will be sorted according to rating
    Map<String,String> foodToCuisine;
    Map<String,Integer> foodToRating;
    Map<String,TreeSet<String>> cuisinToFoodRatingSet;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisinToFoodRatingSet = new HashMap<>();

        for(int i=0;i<foods.length;i++){
            foodToCuisine.put(foods[i], cuisines[i]);
            foodToRating.put(foods[i], ratings[i]);
        }
        Comparator<String> comp = (a,b) ->{
            int ra=foodToRating.get(a);
            int rb=foodToRating.get(b);
            if(ra!=rb){
                return Integer.compare(rb, ra);
            }
            return a.compareTo(b);
        };

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            cuisinToFoodRatingSet.computeIfAbsent(cuisine, k->new TreeSet<>(comp)).add(food);
            TreeSet<String> set = cuisinToFoodRatingSet.get(cuisine);
        }


    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        TreeSet<String> set = cuisinToFoodRatingSet.get(cuisine);
        set.remove(food);
        foodToRating.put(food,newRating);
        set.add(food);
    }
    
    public String highestRated(String cuisine) {
        TreeSet<String> set = cuisinToFoodRatingSet.get(cuisine);
        return set.first();
    }
}
