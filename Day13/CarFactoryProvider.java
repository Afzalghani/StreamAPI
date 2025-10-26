package Day13;

public class CarFactoryProvider {

    public CarFactory getCarFactory(CarType carType, String brand) {
        return switch (carType) {
            case LUXURY -> new LuxuryCarFactory(brand);
            case ECONOMY -> new EconomyCarFactory(brand);
            default -> null;
        };

    }
}
