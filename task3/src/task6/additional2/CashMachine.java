package task6.additional2;


import java.util.HashMap;
import java.util.Map;

public class CashMachine {
    public int amountBanknotes20;
    public int amountBanknotes50;
    public int amountBanknotes100;

    public CashMachine(int amountBanknotes20, int amountBanknotes50, int amountBanknotes100) {
        this.amountBanknotes20 = amountBanknotes20;
        this.amountBanknotes50 = amountBanknotes50;
        this.amountBanknotes100 = amountBanknotes100;
    }


    public void addMoneyInATM(int bill20, int bill50, int bill100) {
        amountBanknotes100 += bill100;
        amountBanknotes50 += bill50;
        amountBanknotes20 += bill20;
    }

    public boolean withdrawMoneyFromATM(double sumForWithdraw) {
        if (sumForWithdraw < calculateBalance() && sumForWithdraw % 10 == 0) {
            Map<Integer, Integer> emptyCashMap = createEmptyCashMap();
            Map<Integer, Integer> cashMap = cashMap(sumForWithdraw, amountBanknotes20, amountBanknotes50, amountBanknotes100, emptyCashMap);
            if (!(cashMap.isEmpty())) {
                takeCash(cashMap);
                return true;
            }
        }
        return false;
    }

    private double calculateBalance() {
        return (amountBanknotes20 * 20) + (amountBanknotes50 * 50) + (amountBanknotes100 * 100);
    }

    private Map<Integer, Integer> createEmptyCashMap() {
        Map<Integer, Integer> resultOperation = new HashMap<>();
        resultOperation.put(20, 0);
        resultOperation.put(50, 0);
        resultOperation.put(100, 0);
        return resultOperation;
    }

    private void takeCash(Map<Integer, Integer> cashMap) {
        amountBanknotes20 -= cashMap.get(20);
        System.out.println("снято " + cashMap.get(20) + " номиналом 20");
        amountBanknotes50 -= cashMap.get(50);
        System.out.println("снято " + cashMap.get(50) + " номиналом 50");
        amountBanknotes100 -= cashMap.get(100);
        System.out.println("снято " + cashMap.get(100) + " номиналом 100");
    }

    private Map<Integer, Integer> cashMap(double sumForWithdraw, int amountBanknotes20, int amountBanknotes50, int amountBanknotes100, Map<Integer, Integer> cashMap) {
        while (sumForWithdraw >= 20) {
            if (sumForWithdraw >= 100 && amountBanknotes100 > 0) {
                int sumForWithdraw100 = cashMap.get(100);
                cashMap.put(100, ++sumForWithdraw100);
                sumForWithdraw = sumForWithdraw - 100;
                amountBanknotes100--;
                continue;
            }
            if (sumForWithdraw >= 50 && amountBanknotes50 > 0) {
                int sumForWithdraw50 = cashMap.get(50);
                cashMap.put(50, ++sumForWithdraw50);
                sumForWithdraw = sumForWithdraw - 50;
                amountBanknotes50--;
                continue;
            }
            if (sumForWithdraw >= 20 && amountBanknotes20 > 0) {
                int sumForWithdraw20 = cashMap.get(20);
                cashMap.put(20, ++sumForWithdraw20);
                sumForWithdraw = sumForWithdraw - 20;
                amountBanknotes20--;
            }
        }
        if (sumForWithdraw == 0) {
            return cashMap;
        } else {
            return new HashMap<>();
        }
    }
}
