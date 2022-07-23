package task6;

import task6.additional1.Computer;
import task6.additional1.HDD;
import task6.additional1.RAM;
import task6.additional2.CashMachine;
import task6.entity.CreditCard;
import task6.service.CreditCardService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CreditCardService service = new CreditCardService();
        int n = 1;
        List<CreditCard> cards = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ����� " + n + " �����");
            n++;
            int accountNumber = scanner.nextInt();
            System.out.println("������� �������������� ����� �� �����");
            double currentSum = scanner.nextDouble();
            CreditCard card = new CreditCard(accountNumber, currentSum);
            cards.add(card);
        }
        for (int i = 1; i <= cards.size(); i++) {
            System.out.println("����������� ������ �� ����� � " + i + " = " + cards.get(i - 1).getCurrentSum());
        }
        System.out.println();
        System.out.println("������ ������ �� ������ ��� �����");
        service.putOnTheCard(cards.get(0), 12547);
        service.putOnTheCard(cards.get(1), 121);
        System.out.println("������� ������ � ������� �����");
        service.takeOffMoney(cards.get(2), 124);
        for (int i = 1; i <= cards.size(); i++) {
            System.out.println("������ ����� ��������� �� ����� � " + i + " = " + cards.get(i - 1).getCurrentSum());
        }
        System.out.println();

        System.out.println("�������� � ����������");
        CashMachine cashMachine = new CashMachine(3, 8, 9);
        cashMachine.addMoneyInATM(30, 2, 8);
        cashMachine.withdrawMoneyFromATM(370);
        System.out.println();

        System.out.println("������ � �����������");
        Computer computer1 = new Computer(125, "Hoho2020");
        System.out.println(computer1);
        Computer computer2 = new Computer(520, "Model125", new RAM("Rum125",
                125.5), new HDD("Hdd12547", 1245, "�������"));
        System.out.println(computer2);
    }
}
