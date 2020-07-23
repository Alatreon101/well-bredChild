public class Mother {

    Children children = new Children();

    public static void main(String[] args) {
        Mother mother = new Mother();
        for (Foods f : Foods.values()) {
            System.out.printf("Кормим: %s%n", f.name());
            mother.feedChild(f);
        }
    }

    public void feedChild(Foods food) {
        try {
            children.eat(food);
        } catch (TastelessFoodException e) {
            System.out.println("Не любит этот продукт");
        }
    }
}
