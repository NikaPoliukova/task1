package task6.additional1;

public class HDD {
    String nameHDD;
    double capacity;
    String type;

    public HDD() {
    }

    public HDD(String nameHDD, double capacity, String type) {
        this.nameHDD = nameHDD;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD :[nameHDD = " + nameHDD +
                ", capacity = " + capacity
                + ", type = " + type + "]";
    }
}
