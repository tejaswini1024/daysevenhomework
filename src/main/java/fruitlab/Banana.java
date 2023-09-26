package fruitlab;

public class Banana extends Fruit {

    public Banana(){
        setCalories(105);
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("i don't like banana juice");
    }
}