package hackerrank;

public class DayOfProgrammer {

    public static void main(String[] args) {

        int year = 2017 ;
        String date = dayOfProgrammer(year) ;
        System.out.println(date) ;

    }

    public static String dayOfProgrammer(int year){

        if (year == 1918){

            return "26.09.2018" ;
        }

        boolean isLeapYear ;

        if (year >= 1700 && year<=1917){

            isLeapYear = (year % 4 == 0);
        }else {
            isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        String day = isLeapYear ? "12" :"13" ;

        return day + ".09." + year ;
    }
}
