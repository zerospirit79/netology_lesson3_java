public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(100);
        System.out.println("Вам начислено - " + miles + " бонусных миль");

        int milesZero = service.calculate(0);
        System.out.println("Вам начислено - " + milesZero + " бонусных миль");

        int milesThouthend = service.calculate(10_000);
        System.out.println("Вам начислено - " + milesThouthend + " бонусных миль");

        int milesNegative = service.calculate(-100);
        System.out.println("Вам начислено - " + milesNegative + " бонусных миль");

    }
}
