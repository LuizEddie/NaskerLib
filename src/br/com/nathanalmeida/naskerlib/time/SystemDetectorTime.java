package br.com.nathanalmeida.naskerlib.time;

/**
 * Created by Neitan96 on 04/10/2016.
 */
public class SystemDetectorTime implements DetectorTime{

    @Override
    public long getMilliSeconds(){
        return System.currentTimeMillis();
    }

}
