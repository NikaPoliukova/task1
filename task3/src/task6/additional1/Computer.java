package task6.additional1;

public class Computer {
    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Компьютер :\n стоимость = " + cost + ", \n модель = " + model + ", \n" + ram + ",\n " + hdd + "]";
    }
}



