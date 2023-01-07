public class Main {
    public static void main(String[] args) {
        int wallet = 100;   // начальный счет
        int transaction = 1100; // зачисление
        int loyalCheck = 1000; // минимальное значение для начисления бонусов
        int rubel = 100;    // 1 рубль за 100

        int bonus;          // подсчет бонусов
        if (transaction > loyalCheck) {
            bonus = transaction / rubel;
        } else {
            bonus = 0;
        }
        int finalScore = wallet + transaction + bonus; // итоговый счет

        System.out.println("Бонусов начислено: " + bonus);
        System.out.println("Итоговый счет: " + finalScore);

    }
}