import java.time.LocalDate;

public class Car extends Transport implements Competing {
    //private double engineCapacity;   // объем движка
    // private final String bodyType;  //тип кузова
    // private String registrationNumber;     // рег. номер
    // private final int numberOfSeats;   // кол.мест
    // private boolean summerTyres;


    public Car(String make, String model, double engineCapacity) {
        super(make, model, engineCapacity);
    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для легкового автомобиля ");
        return null;
    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время у легкового автомобиля ");
        return 0;
    }

    @Override
    public float maximumSpeed() {
        System.out.println(" Максимальная скорость легкового автомобиля ");
        return 0;
    }
}

