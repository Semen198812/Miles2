public class BonusMilesService {
    public int calculate(int price) {
        int amount = 20; // количество рублей для одной бонусной мили
        int bonus = price / amount; // количество бонусных миль
        return bonus;
    }
}
