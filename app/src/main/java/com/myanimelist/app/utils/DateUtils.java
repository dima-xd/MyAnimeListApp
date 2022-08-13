package com.myanimelist.app.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtils {

    public static String initDate(String date) throws ParseException {
        if (StringUtils.isNotEmpty(date)) {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(org.apache.commons.lang3.time.DateUtils.parseDate(date, "yyyy-MM-dd"));
            return StringUtils.substring(new DateFormatSymbols().getMonths()[calendar.get(Calendar.MONTH)], 0, 3) + " " +
                    calendar.get(Calendar.DAY_OF_MONTH) + ", " +
                    calendar.get(Calendar.YEAR);
        }
        return "?";
    }
}
