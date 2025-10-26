package Day12.Strategy.Vechle;

import Day12.Strategy.ParentStrategy;

public class Vahan {
    ParentStrategy strategy;
    public Vahan(ParentStrategy strategy) {
        this.strategy = strategy;
    }
    public void drive(){
        strategy.drive();
    }
}
