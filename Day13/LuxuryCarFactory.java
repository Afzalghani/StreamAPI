package Day13;

public class LuxuryCarFactory implements CarFactory {
  String brand;
    LuxuryCarFactory(String brand){
      this.brand = brand;;
  }
    @Override
    public CarInterior createInterior() {
        return new LuxuryCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new LuxuryCarExterior();
    }
}
