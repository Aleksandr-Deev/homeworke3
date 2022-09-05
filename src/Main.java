public class Main {
    public static void main(String[] args) {

        // Задание √1

        byte b = 127;
        short s = 32745;
        int i = 12754678;
        long l = 87665445678L;
        float f = 5.875f;
        double d = 56.9865437;
        System.out.println("Значение переменой b с типом byte равно " + b);
        System.out.println("Значение переменой s с типом short равно " + s);
        System.out.println("Значение переменой i с типом int равно " + i);
        System.out.println("Значение переменой l с типом long равно " + l);
        System.out.println("Значение переменой f с типом float равно " + f);
        System.out.println("Значение переменой d с типом double равно " + d);

        System.out.println();
        //Задание √2

        float filter = 27.12f;
        long look = 987678965549L;
        double boom = 2.786;
        boolean leg = false;
        short sim = 569;
        short socks = -159;
        int inter = 27879;
        byte dog = 67;
        System.out.println("filter " + filter + ", look " + look + ", boom " + boom +
                ", leg " + leg + ", sim " + sim + ", socks " + socks +
                ", inter " + inter + ", dog " + dog + ".");

        System.out.println();
        //Задание √3

        short ludmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        short totalSheets = 480;
        int oneStudent = totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " + oneStudent +  " листов бумаги.");

        System.out.println();
        //Задание √4

        byte productivity = 16;
        byte time = 2;
        int perMinute = productivity / time;
        int minute20 = 20 * perMinute;
        int day = 24 * perMinute;
        int threeDays = 3 * day * perMinute;
        int month = 30 * day * perMinute;
        System.out.println("За 20 минут машина произвела бутылок " + minute20 + " штук.");
        System.out.println("За сутки машина произвела бутылок " + day + " штук.");
        System.out.println("За три дня машина произвела бутылок " + threeDays + " штук.");
        System.out.println("За месяц машина произвела бутылок " + month + " штук.");

        System.out.println();
        //Занятие √5

        short all = 120;
        short white = 2;
        short brown = 4;
        int allClass = all / (white + brown);
        int whiteJar = white * allClass;
        int brownJar = brown * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteJar +
                " банок белой краски и " + brownJar + " банок коричневой краски.");

        System.out.println();
        //Задание √6

        int bananas = 80*5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int allWeight = (bananas + milk + iceCream + eggs) / 1000;
        System.out.println( "Вес спорт-завтрака - " + allWeight + " кг.");

        System.out.println();
        //Задание √7

        int loseWeight = 7 * 1000;
        int gramsDay250 = 250;
        int gramsDay500 = 500;
        int weightLossDays250 = loseWeight / gramsDay250;
        int weightLossDays500 = loseWeight / gramsDay500;
        int averageDay = (weightLossDays250 + weightLossDays500) / 2;
        System.out.println( "При потери 250 грамм в день, спортсмен сбросит 7 кг за " +  weightLossDays250 + " дней.");
        System.out.println( "При потери 500 грамм в день, спортсмен сбросит 7 кг за " +  weightLossDays500 + " дней.");
        System.out.println("Для похудания потребуется в среднем " + averageDay + " дней.");

        System.out.println();
        //Задание √8

        int masha = 67760;
        int denis = 83690;
        var christina = 76230;
        double raisingMoneysMasha = masha * 0.1 + masha;
        double raisingMoneysDenis = denis * 0.1 + denis;
        var raisingMoneysChristina = christina * 0.1 + christina;
        double annualIncomeMasha = (raisingMoneysMasha * 12) - (masha * 12);
        double annualIncomeDenis = (raisingMoneysDenis * 12) - (denis * 12);
        var annualIncomeChristina = (raisingMoneysChristina * 12) - (christina * 12);
        System.out.println("Маша теперь получает " + raisingMoneysMasha + " рублей. Годовой доход вырос на "
                + annualIncomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + raisingMoneysDenis + " рублей. Годовой доход вырос на "
                + annualIncomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + raisingMoneysChristina + " рублей. Годовой доход вырос на "
                + annualIncomeChristina + " рублей.");

    }
}