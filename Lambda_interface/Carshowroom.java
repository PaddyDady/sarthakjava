package Lambda_interface;


interface Car{
    void seltos(boolean Xline);
    void sonet(boolean Sportsline);

}

interface Truck{
    void scania(boolean fourwheel);
    void volvo(boolean sixwheel);


}
 class CarTruck implements Car,Truck{

    @Override
    public void scania(boolean fourwheel) {
        System.out.println("Want scania"+fourwheel);
    }

    @Override
    public void volvo(boolean sixwheel) {
        System.out.println("Want volvo"+sixwheel);
    }

    @Override
    public void seltos(boolean Xline) {
       System.out.println("Want seltos"+Xline);
    }

    @Override
    public void sonet(boolean Sportsline) {
    System.out.println("Want sonet"+Sportsline);
    }

 }

public class Carshowroom {
    
}
