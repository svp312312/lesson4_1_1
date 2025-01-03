package Introduction_Spring;

public class Car implements Machine{

    @Override
    public void voice(){
        System.out.println("Car's voice");
    }
    @Override
    public String toString(){return "";}

    @Override
    public void info()

    {
        final int n = 6;
        Car[] car = new Car[n];
        car[0] = new AccumulatorSuspension();
        car[1] = new starter();
        car[2] = new sparkplug();
        car[3] = new WheelEngine();
        car[4] = new hinge();
        car[5]  = new differential();
        System.out.println("\nMachine information:");
        System.out.println("====================\n");
        for(int i = 0; i < n; i++){
            System.out.print(car[i].toString() + "\n");

        }

//        Class<?>[] subclasses = {AccumulatorSuspension.class,  starter.class,sparkplug.class, WheelEngine.class};
//        System.out.println("Cостав car:");
//        for (Class<?> subclass : subclasses) {
//            if (Car.class.isAssignableFrom(subclass) && subclass != Car.class) {
//                System.out.println(" - " + subclass.getSimpleName());
//                System.out.println(subclass.toString());
//
//
//            }
//        }
    }
}

