package CreationalDesignPattern;

public class Main {
public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

//        // Abstract Factory
//        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);
//        Shape shape4 = shapeFactory2.getShape("RECTANGLE");
//        shape4.draw();
//        Shape shape5 = shapeFactory2.getShape("SQUARE");
//        shape5.draw();
//
//        AbstractFactory shapeFactory3 = FactoryProducer.getFactory(true);
//        Color color1 = shapeFactory3.getColor("RED");
//        color1.fill();
//        Color color2 = shapeFactory3.getColor("GREEN");
//        color2.fill();
//        Color color3 = shapeFactory3.getColor("BLUE");
//        color3.fill();
//
//        // Builder
//        MealBuilder mealBuilder = new MealBuilder();
//        Meal vegMeal = mealBuilder.prepareVegMeal();
//        System.out.println("Veg Meal");
//        vegMeal.showItems();
//        System.out.println("Total Cost: " + vegMeal.getCost());
//
//        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//        System.out.println("\n\nNon-Veg Meal");
//        nonVegMeal.showItems();
//        System.out.println("Total Cost: " + nonVegMeal.getCost());
//
//        // Prototype
//        ShapeCache.loadCache();
//
//        Shape clonedShape = (Shape) ShapeCache.getShape("1");
//        System.out.println("Shape: " + clonedShape.getType());
//
//        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
//        System.out.println("Shape: " + clonedShape2.getType());
//
//        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
//        System.out.println("Shape: " + clonedShape3.getType());
    }
}