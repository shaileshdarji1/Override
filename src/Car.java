public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void wheel() {
        System.out.println("Car has 4 wheel");
    }
}
