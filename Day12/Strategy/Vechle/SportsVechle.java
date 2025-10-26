package Day12.Strategy.Vechle;

import Day12.Strategy.SportsStrategy;

public class SportsVechle extends Vahan{
    public SportsVechle() {
        super(new SportsStrategy());
    }
}
