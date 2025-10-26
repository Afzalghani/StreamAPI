package Day12.Strategy;

public class NormalStrategy implements ParentStrategy{
    @Override
    public void drive() {
        System.out.println("NormalStrategy: for the Normal Drive");
    }
}
