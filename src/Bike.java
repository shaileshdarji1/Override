public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void wheel() {
        System.out.println("Bike has 2 wheel");
    }

}
