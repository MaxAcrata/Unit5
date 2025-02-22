public class BonusService {
    // Раасчет бонуса при пополнеиии зарегистрированого и незарегистрированого пользователя
    public long calculate(long amount, boolean registered) {
        int Percent = registered ? 3 : 1;  // тернарное выражение
        long bonus = amount * Percent / 100;
        long limit = 500; // макс лимит бонусов
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
