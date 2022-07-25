package task6.additional1;

public class RAM {
    String nameRAM;
    double capacity;

    public RAM() {
    }

    public RAM(String nameRAM, double capacity) {
        this.nameRAM = nameRAM;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM: [nameRAM = " + nameRAM
                + ", capacity = " + capacity + "]";
    }
}
