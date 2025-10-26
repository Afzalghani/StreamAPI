package Day13;

public class EconomyCarFactory implements CarFactory{
    String brand;
    EconomyCarFactory(String brand){
        this.brand = brand;
    }
    @Override
    public CarInterior createInterior() {
        return new EconomyCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return  new EconomyCarExterior();
    }
}
