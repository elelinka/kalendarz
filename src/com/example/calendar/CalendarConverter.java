package com.example.calendar;

public class CalendarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String dayOfWeek;
        switch (dayNumber) {
            case MONDAY:
                dayOfWeek = "Poniedzialek";
                break;
            case TUESDAY:
                dayOfWeek = "Wtorek";
                break;
            case WEDNESDAY:
                dayOfWeek = "Sroda";
                break;
            case THURSDAY:
                dayOfWeek = "Czwartek";
                break;
            case FRIDAY:
                dayOfWeek = "Piatek";
                break;
            case SATURDAY:
                dayOfWeek = "Sobota";
                break;
            case SUNDAY:
                dayOfWeek = "Niedziela";
                break;
            default:
                dayOfWeek = "dzien nie istnieje";
        }
        return dayOfWeek;
    }
}
