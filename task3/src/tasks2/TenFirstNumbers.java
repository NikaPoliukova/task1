package tasks2;

public class TenFirstNumbers {
    public static void findTenFirstNumbers() {
        int oneNumber = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(oneNumber);
            oneNumber = oneNumber - 5;
        }
    }
}

