package by.epam.task02.t02;


import java.time.YearMonth;

class DaysMonthCounter {
    public static  int countByYearAndMonth(int year, int month){
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
}
