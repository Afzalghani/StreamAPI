package Day13;

public class Client {
    public static void main(String[] args) {
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();
        CarFactory economyCarFactory=
                carFactoryProvider.getCarFactory(CarType.LUXURY,"Mercedes");
        economyCarFactory.CompleteProductType();


    }
}
