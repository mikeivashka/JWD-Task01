package by.epam.second;


import java.time.YearMonth;

class DaysMonthCounter {
    public static  int countByYearAndMonth(int year, int month){
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
}
