package Day12.Strategy;

public class SportsStrategy implements  ParentStrategy{

    @Override
    public void drive() {
        System.out.println("SportsStrategy: This Sports Strategy");
    }
}
