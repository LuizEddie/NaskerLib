package br.com.nathanalmeida.naskerlib.lang;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * Created by Neitan96 on 02/10/2016.
 */
public class PropertiesPlus extends Properties{

    public PropertiesPlus(){
    }

    public PropertiesPlus(Properties defaults){
        super(defaults);
    }

    @Override
    public synchronized void load(Reader reader){
        try{
            super.load(reader);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void load(InputStream inStream){
        InputStreamReader reader = new InputStreamReader(inStream, Charset.forName("UTF-8"));
        load(reader);
    }

}
