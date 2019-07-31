package com.example.main;

import com.example.calendar.CalendarConverter;

public class ConverterTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            String day = CalendarConverter.convertDayToString(i);
            System.out.println(i + " dzien tygodnia to " + day);
        }
    }
}
