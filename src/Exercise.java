import java.time.LocalDate;



public class Exercise {


    //Using LocaleDate or another Date class calculate and print:
    //How many days are left till the end of the month
    //How many days are left till the end of the year, using the length() method from java.time.Year.of()

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        int totalDaysOfMonth = localDate.lengthOfMonth();
        int howManyDayLeftForTheEndOfMonth = totalDaysOfMonth - localDate.getDayOfMonth();
        int totalDaysOfMonthInAYear = localDate.lengthOfYear();
        int howManyDayLeftForTheEndOfTheYear = totalDaysOfMonthInAYear - localDate.getDayOfYear();



        System.out.println("Days left till the end of the month: " + howManyDayLeftForTheEndOfMonth);
        System.out.println("Days left till the end of the year: " + howManyDayLeftForTheEndOfTheYear);
    }


}
