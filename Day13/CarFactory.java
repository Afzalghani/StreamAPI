package Day13;

public interface CarFactory {
    //Factory method
    CarInterior createInterior();
   CarExterior createExterior();

   default  void CompleteProductType(){
       System.out.println("Starting the car production from the begining");
       var carInterior = createInterior();
       var carExterior = createExterior();

       carInterior.addInteriorComponents();
       carExterior.addExteriorComponents();

       System.out.println("Car production completed");

   }
}
