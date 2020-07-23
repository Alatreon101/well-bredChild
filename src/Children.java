import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Children {

    List<Foods> tastelessFoods = new ArrayList<>(
            Arrays.asList(Foods.PINEAPPLE, Foods.APPLE));

    public void eat(Foods food) throws TastelessFoodException {
        for (Foods f : tastelessFoods) {
            if (f.equals(food)) {
                System.out.println("Не вкусно! ");
                System.out.println("Спасибо, мамочка! ");
                throw new TastelessFoodException();
            }
        }
        System.out.println("Вкусно!");
        System.out.println("Спасибо, мамочка! ");
    }
}
