public class Bus extends Transport implements Competing {

    public Bus(String make, String model, double engineCapacity) {
        super(make, model, engineCapacity);
    }

    @Override
    public void refill() {
        System.out.println(" Запрвить автомобиль дизелем  на завправке");

    }

    @Override
    public void startMoving() {
        System.out.println("начать движение автобуса");

    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение автобуса");

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

