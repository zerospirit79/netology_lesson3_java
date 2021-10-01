public class BonusMilesService {
    public int calculate(int priceTicket) {
        if (priceTicket >= 0) {
            int bonusMiles = priceTicket / 20;
            return bonusMiles;
        } else {
            System.out.println("Цена на билет не может быть отрицательна!!!");
            return 0;
        }

    }
}
