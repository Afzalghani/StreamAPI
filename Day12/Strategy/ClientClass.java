package Day12.Strategy;

import Day12.Strategy.Vechle.NormalVechle;
import Day12.Strategy.Vechle.SportsVechle;
import Day12.Strategy.Vechle.Vahan;

public class ClientClass {
    public static void main(String[] args) {
        Vahan vahan = new SportsVechle();
        vahan.drive();
    }
}
