package task6.service;

import task6.entity.CreditCard;

import java.util.Scanner;

public class CreditCardService {

    public CreditCard putOnTheCard(CreditCard card, double amount) {
        double newSum = card.getCurrentSum() + amount;
        card.setCurrentSum(newSum);
        return card;
    }


    public CreditCard takeOffMoney(CreditCard card, int amount) {
        if (card.getCurrentSum() < amount) {
            System.out.println("Превышена допустимая сумма для снятия, введите сумму,меньше " + card.getCurrentSum());
        } else {
            double newSum = card.getCurrentSum() - amount;
            card.setCurrentSum(newSum);
        }
        return card;
    }


    public String printSumCard(CreditCard card) {
        return "Баланс вашей карты составляет " + card.getCurrentSum();
    }
}
