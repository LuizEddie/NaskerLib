package br.com.nathanalmeida.naskerlib.lang;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Neitan96 on 02/10/2016.
 */
public final class Lang{

    public final static Lang MONTH_JANUARY = new Lang("Month.January");
    public final static Lang MONTH_FEBRUARY = new Lang("Month.February");
    public final static Lang MONTH_MARCH = new Lang("Month.March");
    public final static Lang MONTH_APRIL = new Lang("Month.April");
    public final static Lang MONTH_MAY = new Lang("Month.May");
    public final static Lang MONTH_JUNE = new Lang("Month.June");
    public final static Lang MONTH_JULY = new Lang("Month.July");
    public final static Lang MONTH_AUGUST = new Lang("Month.August");
    public final static Lang MONTH_SEPTEMBER = new Lang("Month.September");
    public final static Lang MONTH_OCTOBER = new Lang("Month.October");
    public final static Lang MONTH_NOVEMBER = new Lang("Month.November");
    public final static Lang MONTH_DECEMBER = new Lang("Month.December");

    public final static Lang WEEK_SUNDAY = new Lang("Week.Sunday");
    public final static Lang WEEK_MONDAY = new Lang("Week.Monday");
    public final static Lang WEEK_TUESDAY = new Lang("Week.Tuesday");
    public final static Lang WEEK_WEDNESDAY = new Lang("Week.Wednesday");
    public final static Lang WEEK_THURSDAY = new Lang("Week.Thursday");
    public final static Lang WEEK_FRIDAY = new Lang("Week.Friday");
    public final static Lang WEEK_SATURDAY = new Lang("Week.Saturday");

    private final static String FILENAME_DEFAULT = "pt-br.lang";

    private final static Set<Lang> LANGS = new HashSet<>();

    static{
        loadLang(Lang.class.getResourceAsStream(FILENAME_DEFAULT));
    }

    public static void loadLang(InputStream inputStream){
        PropertiesPlus properties = new PropertiesPlus();
        properties.load(inputStream);
        for(Lang lang : LANGS){
            lang.load(properties);
        }
    }

    private final String key;
    private String string = null;
    private String[] array = null;

    private Lang(String key){
        this.key = key;
        LANGS.add(this);
    }

    public String getString(){
        return string;
    }

    public String[] getArray(){
        return array;
    }

    public String getFirstString(){
        if(array != null && array.length != 0)
            return array[0];
        return null;
    }

    public boolean contains(String word){
        String[] array = getArray();

        if(array != null)
            for(String line : array)
                if(line.equalsIgnoreCase(word)) return true;

        return false;
    }

    private void load(Properties properties){
        string = properties.getProperty(key);
        if(string != null) array = string.split(",( *)?");
        else array = new String[0];
    }

}
