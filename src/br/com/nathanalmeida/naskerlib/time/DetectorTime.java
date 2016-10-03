package br.com.nathanalmeida.naskerlib.time;

/**
 * Classe para detecta a hora atual.
 * <p>
 * Created by Neitan96 on 02/10/2016.
 */
public interface DetectorTime{

    /**
     * @return Milisegundos atual
     */
    default long getMilliSeconds(){
        return System.currentTimeMillis();
    }

}
