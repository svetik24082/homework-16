public class Bus extends Transport implements Competing {

    public Bus(String make, String model, double engineCapacity) {
        super(make, model, engineCapacity);
    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для автобуса ");
        return null;

    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время на гонке у автобуса");
        return 0;

    }

    @Override
    public float maximumSpeed() {

        System.out.println(" Максимальная скорость автобуса ");
        return 0;
    }
}

