public class BonusService {
    // Раасчет бонуса при пополнеиии зарегистрированого и незарегистрированого пользователя
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;  // тернарное выражение
        long bonus = amount * percent / 100;
        long limit = 500; // макс лимит бонусов
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

