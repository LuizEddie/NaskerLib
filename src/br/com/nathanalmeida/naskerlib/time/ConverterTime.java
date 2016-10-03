package br.com.nathanalmeida.naskerlib.time;

import br.com.nathanalmeida.naskerlib.lang.Lang;

/**
 * Created by Neitan96 on 02/10/2016.
 */
public class ConverterTime{

    public static int getWeek(String week){
        week = week.toLowerCase();
        if(Lang.WEEK_SUNDAY.contains(week)) return 1;
        if(Lang.WEEK_MONDAY.contains(week)) return 2;
        if(Lang.WEEK_TUESDAY.contains(week)) return 3;
        if(Lang.WEEK_WEDNESDAY.contains(week)) return 4;
        if(Lang.WEEK_THURSDAY.contains(week)) return 5;
        if(Lang.WEEK_FRIDAY.contains(week)) return 6;
        if(Lang.WEEK_SATURDAY.contains(week)) return 7;
        return -1;
    }

    public static String getWeek(int week){
        switch(week){
            case 1:
                return Lang.WEEK_SUNDAY.getFirstString();
            case 2:
                return Lang.WEEK_MONDAY.getFirstString();
            case 3:
                return Lang.WEEK_TUESDAY.getFirstString();
            case 4:
                return Lang.WEEK_WEDNESDAY.getFirstString();
            case 5:
                return Lang.WEEK_THURSDAY.getFirstString();
            case 6:
                return Lang.WEEK_FRIDAY.getFirstString();
            case 7:
                return Lang.WEEK_SATURDAY.getFirstString();
            default:
                return null;
        }
    }


    public static int getMonth(String month){
        if(Lang.MONTH_JANUARY.contains(month)) return 0;
        if(Lang.MONTH_FEBRUARY.contains(month)) return 1;
        if(Lang.MONTH_MARCH.contains(month)) return 2;
        if(Lang.MONTH_APRIL.contains(month)) return 3;
        if(Lang.MONTH_MAY.contains(month)) return 4;
        if(Lang.MONTH_JUNE.contains(month)) return 5;
        if(Lang.MONTH_JULY.contains(month)) return 6;
        if(Lang.MONTH_AUGUST.contains(month)) return 7;
        if(Lang.MONTH_SEPTEMBER.contains(month)) return 8;
        if(Lang.MONTH_OCTOBER.contains(month)) return 9;
        if(Lang.MONTH_NOVEMBER.contains(month)) return 10;
        if(Lang.MONTH_DECEMBER.contains(month)) return 11;
        return -1;
    }

    public static String getMonth(int month){
        switch(month){
            case 0:
                return Lang.MONTH_JANUARY.getFirstString();
            case 1:
                return Lang.MONTH_FEBRUARY.getFirstString();
            case 2:
                return Lang.MONTH_MARCH.getFirstString();
            case 3:
                return Lang.MONTH_APRIL.getFirstString();
            case 4:
                return Lang.MONTH_MAY.getFirstString();
            case 5:
                return Lang.MONTH_JUNE.getFirstString();
            case 6:
                return Lang.MONTH_JULY.getFirstString();
            case 7:
                return Lang.MONTH_AUGUST.getFirstString();
            case 8:
                return Lang.MONTH_SEPTEMBER.getFirstString();
            case 9:
                return Lang.MONTH_OCTOBER.getFirstString();
            case 10:
                return Lang.MONTH_NOVEMBER.getFirstString();
            case 11:
                return Lang.MONTH_DECEMBER.getFirstString();
            default:
                return null;
        }
    }

}
