package fruitlab;

public class Market {

    public static void main(String[] args){
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
