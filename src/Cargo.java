public class Cargo extends Transport implements Competing {


    public Cargo(String make, String model, double engineCapacity) {
        super(make, model, engineCapacity);
    }

    @Override
    public void refill() {
        System.out.println(" Запрвить грузовик дизелем  на завправке");

    }

    @Override
    public void startMoving() {
        System.out.println("начать движение грузовика");

    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение грузовика");

    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для грузового автомобиля ");
        return null;
    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время у грузового автомобиля ");
        return 0;
    }

    @Override
    public float maximumSpeed() {
        System.out.println(" Максимальная скорость у грузового автомобиля ");
        return 0;
    }


}

