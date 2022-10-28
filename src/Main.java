public class Main {
    public static void main(String[] args) {
        Car car = new Car(null, null, 0);
        //car.refill();
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ",
                3.0);

        Car car2 = new Car(" BMW ", " Z8 ", 3.0);
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения",
                2.4);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car.startMoving();
        car.finishTheMovement();
        car.pitStop();
        car.bestLapTime();
        car.maximumSpeed();
        System.out.println();


        Bus bus = new Bus(" Икарус", "250", 0);
        Bus bus1 = new Bus(" ПАЗ", "32053", 16);
        Bus bus2 = new Bus(" Вольво", null, 17);
        Bus bus3 = new Bus(" Ман", "Lion's Citi", 15);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        bus.startMoving();
        bus.finishTheMovement();
        bus.pitStop();
        bus.bestLapTime();
        bus.maximumSpeed();
        System.out.println();

        Cargo cargo = new Cargo(" Камаз", "4310", 20);
        Cargo cargo1 = new Cargo(" Урал", "4320", 30);
        Cargo cargo2 = new Cargo(" Валдай", "Next", 25);
        Cargo cargo3 = new Cargo(" Маз", "4570", 0);

        System.out.println(cargo);
        System.out.println(cargo1);
        System.out.println(cargo2);
        System.out.println(cargo3);
        cargo.startMoving();
        cargo.finishTheMovement();
        cargo.pitStop();
        cargo.bestLapTime();
        cargo.maximumSpeed();

    }
}