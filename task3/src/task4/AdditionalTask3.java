package task4;

import java.util.Arrays;

public class AdditionalTask3 {
    public static String[] sortNames() {
        String[] names = {"���", "���", "����", "����", "����"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        return names;
    }
}

