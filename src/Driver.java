public abstract class Driver<T extends Transport> {
    private final String fullName;
    private String driverSLicense;
    private int experience;
    private final T car;

    public Driver(String fullName, String driverSLicense, int experience, T car) {
        this.fullName = validOrDefault(fullName, " Информация не указана");
        this.driverSLicense = validOrDefault(driverSLicense, " Информация не указана ");
        this.experience = experience > 0.0 ? experience : 10;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Водитель " +
                fullName +
                ", управляет автомобилем " + car.getMake() + " " + car.getModel() +
                " , будет учавствовать в заезде. ";
    }


    public String getFullName() {
        return fullName;
    }

    public T getCar() {
        return car;
    }

    public String getDriverSLicense() {
        return driverSLicense;
    }

    public void setDriverSLicense(String driverSLicense) {
        this.driverSLicense = validOrDefault(driverSLicense, " Информация не указана ");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience > 0.0 ? experience : 10;
    }

    public void refill() {
    }


    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;


        }
    }
}












