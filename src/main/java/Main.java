import java.util.Scanner;
class Main {

    public static   int earnings = 0;
    public static int spendings = 0;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = scanner.nextLine();
                    int money2 = Integer.parseInt(moneyStr2);
                    spendings += money2;
                    break;
                case 3:

                    System.out.println("Доходы ИП:" + earnings);
                    System.out.println("Расходы ИП:" + spendings);
                    System.out.println("УСН доходы: 6% от " + earnings + " рублей = " + taxEarningsOnly(earnings) + " рублей." );
                    System.out.println("УСН доходы минус расходы: 15% от " + (earnings - spendings) + "рублей = " + taxEarningsMinusSpendings(earnings, spendings)+ " рублей");

                    int a = (taxEarningsMinusSpendings(earnings, spendings));
                    int b = (taxEarningsOnly(earnings));

                   if (a < b) {
                       System.out.println("Мы советуем вам УСН доходы минус расходы");
                   } else if (a > b){
                       System.out.println("Мы советуем вам УСН доходы");
                   }else {
                       System.out.println("Выбирайте сами, там одинаково выходит");
                   }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarningsOnly(int earnings) {
        int tax = earnings * 6 / 100;
            return tax;
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            System.out.println("Расходы больше доходов. Налог отрицательный!!!");
            return 0;
        }
    }
}