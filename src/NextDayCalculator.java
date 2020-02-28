public class NextDayCalculator {
    public static String nextDay(int inputDay, int inputMonth, int inputYear) {
        int lastOfMonth = 31;
        switch (inputMonth){
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            case 2:
                if (isLeapYear(inputYear)){
                    lastOfMonth = 29;
                }
                else
                    lastOfMonth = 28;
                break;
        }
        if (inputDay==lastOfMonth){
            if (inputMonth==12){
                inputDay = 1;
                inputMonth = 1;
                inputYear++;
            }
            else {
                inputDay = 1;
                inputMonth++;
            }
        }
        else {
            inputDay++;
        }
        return inputDay+"-"+inputMonth+"-"+inputYear;
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0));
    }
}


