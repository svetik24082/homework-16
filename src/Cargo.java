public class Cargo extends Transport implements Competing {


    public Cargo(String make, String model, double engineCapacity) {
        super(make, model, engineCapacity);
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
        System.out.println(" Максимальная скорость у  грузового автомобиля ");
        return 0;
    }
}
