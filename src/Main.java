public class Main {
    public static void main(String[] args) {
        //задача 1
        int cheese = 5;
        byte holes = 25;
        short tomatoes = 4123;
        long pigs = 34L;
        float length = 23.4f;
        double quality = 99.9;
        System.out.println("Значение переменной cheese с типом int равно " + cheese);
        System.out.println("Значение переменной cheese с типом byte равно " + holes);
        System.out.println("Значение переменной cheese с типом short равно " + tomatoes);
        System.out.println("Значение переменной cheese с типом long равно " + pigs);
        System.out.println("Значение переменной cheese с типом float равно " + length);
        System.out.println("Значение переменной cheese с типом double равно " + quality);
        //задача 2
        float a = 27.12f;
        long b = 987678965549L;
        String c = "2,786";
        short d = 569;
        short e = -159;
        int f = 27897;
        short g = 67;
        //задача 3
        short papers = 480;
        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        int papersPerStudent = papers / (ludmilaStudents + annaStudents + ekaterinaStudents);
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");
        //задача 4
        byte bottlesPer2Minutes = 16;
        int bottlesPer20Minute = bottlesPer2Minutes * 10;
        int bottlesPerDay = bottlesPer20Minute * 3 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPer3Days * 10;
        System.out.println("За двадцать минут машина произвела " + bottlesPer20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        //задача 5
        byte paintsCans = 120;
        byte whiteCansPerClassroom = 2;
        byte brownCansPerClassroom = 4;
        int allWhiteCans = paintsCans * whiteCansPerClassroom / (whiteCansPerClassroom + brownCansPerClassroom);
        int allBrownCans = paintsCans * brownCansPerClassroom / (whiteCansPerClassroom + brownCansPerClassroom);
        int classrooms = paintsCans / (whiteCansPerClassroom + brownCansPerClassroom);
        System.out.println("В школе, где " + classrooms + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");
        //задача 6
        byte countBananas = 5;
        short countMilk = 200;
        byte countIceCream = 2;
        byte countEggs = 4;
        byte weightBananas = 80;
        byte volumeMilk = 100;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        float weightBreakfast = countBananas * weightBananas + countMilk * weightMilk / volumeMilk + countIceCream * weightIceCream + countEggs * weightEggs;
        float weightBreakfastKg = weightBreakfast / 1000;
        System.out.println("Спортсмен на завтрак съедает " + weightBreakfast + " грамм или " + weightBreakfastKg + " килограмм пищи");
        //задача 7
        byte purpose = 7;





    }
}