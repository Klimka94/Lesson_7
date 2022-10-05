public class Main {

    public static void printIsLeapYear(int year) {//Задача 1
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    public static void printIsLeapYearResult(int year, boolean leapYear){
        if (leapYear){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void printVersionOfProgram(int urSystem, int yearOfPhone){//Задача 2
        boolean iosOrAndroid = isIosOrAndroid(urSystem);
        boolean oldOrNew = yearOfUrPhone(yearOfPhone);
        finalVersionOfProgram(urSystem, yearOfPhone, iosOrAndroid, oldOrNew);
    }
    public static boolean isIosOrAndroid(int urSystem){
        return (urSystem == 1);
    }
    public static boolean yearOfUrPhone(int yearOfPhone){
        return (yearOfPhone >= 2015);
    }
    public static void finalVersionOfProgram(int urSystem, int yearOfPhone, boolean iosOrAndroid, boolean oldOrNew){
        if (iosOrAndroid && oldOrNew){
            System.out.println("Рекомендуется стандартная версия для Android.");
        } else if (iosOrAndroid) {
            System.out.println("Рекомендуется облегчённая версия для Android.");
        } else if (oldOrNew){
            System.out.println("Рекомендуется стандартная версия для iOS.");
        } else {
            System.out.println("Рекомендуется облегчённая версия для iOS.");
        }
    }

    public static void printDaysOfDelivery(int distance){//Задача 3
        boolean oneDay = inOneDay(distance);
        boolean twoDays = inTwoDays(distance);
        boolean threeDays = inThreeDays(distance);
        timeOfDelivery(distance, oneDay, twoDays, threeDays);
    }
    public static boolean inOneDay(int distance){
        return (distance <= 20);
    }
    public static boolean inTwoDays(int distance){
        return (distance > 20 && distance <= 60);
    }
    public static boolean inThreeDays(int distance){
        return (distance > 60 && distance <= 100);
    }
    public static void timeOfDelivery(int distance, boolean oneDay, boolean twoDays, boolean threeDays){
        if (oneDay) {
            System.out.println("Доставка карты займёт один день.");
        } else if (twoDays) {
            System.out.println("Доставка карты займёт два дня.");
        } else if (threeDays) {
            System.out.println("Доставка карты займёт три дня.");
        } else {
            System.out.println("Срок карты обсуждается индивидуально.");
        }
    }

    public static void printDoubledLetters(String str){
        findingDoubledSymbol(str, gettingArray(str));
    }
    public static char[] gettingArray(String str) {
        char[] array = str.toCharArray();
        return array;
    }
    public static void findingDoubledSymbol(String str, char[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i]==array[j]){
                    char doubledSymbol = array[i];
                    System.out.println("Найден повторяющийся элемент " + doubledSymbol + ".");
                }
            }
            break;
        }
    }


    public static void main(String[] args) {
        printIsLeapYear(1400);
        printVersionOfProgram(1, 2020);
        printDaysOfDelivery(51);
        printDoubledLetters("aabc");
    }

}