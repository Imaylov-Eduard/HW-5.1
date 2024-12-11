public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        int downPayment = 0;
        int readyToSave = 15_000;
        int savingsAmount = 2_459_000;
        int month = 0;

        while (downPayment < savingsAmount) {
            downPayment += readyToSave;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна" + downPayment + " рублей.");
        }


        System.out.println("Задача№2");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }


        System.out.println("Задача№3");

        int y = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int currentYear = 2024;

        for (int year = currentYear; year < currentYear + 10; year++) {
            y += y * fertility / 1000 - y * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + y);
        }

        System.out.println("Задача4");

        double percentage = 7D / 100;
        savingsAmount = 12_000_000;
        downPayment = readyToSave;
        month = 0;
        while (downPayment < savingsAmount) {
            downPayment = (int) (downPayment * (1 + percentage));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна" + downPayment + " рублей.");
        }

        System.out.println("Задача№5");

        downPayment = readyToSave;
        month = 0;
        while (downPayment < savingsAmount) {
            downPayment = (int) (downPayment * (1 + percentage));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна" + downPayment + " рублей.");
            }
        }

        System.out.println("Задача№6");

        downPayment = readyToSave;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            downPayment = (int) (downPayment * (7 + percentage));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна" + downPayment + " рублей.");
            }
        }
        System.out.println("Задача№7");
        int dayFriday = 3;
        for (int day = dayFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача№8");

        int period = 79;
        int starSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = starSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}



