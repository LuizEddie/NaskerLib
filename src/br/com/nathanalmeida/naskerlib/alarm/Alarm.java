package br.com.nathanalmeida.naskerlib.alarm;

/**
 * Created by Neitan96 on 04/10/2016.
 */
public interface Alarm{

    /**
     * Calcula o próximo alarm a partir do milissegundos especificado.
     * Se o milissegundos do próximo alarm for igual o milissegundos especificado
     * esse será o alarm retornado.
     *
     * @param miliseconds Milissegundos para calcular o próximo alarm.
     * @return Milissegundos do próximo alarm.
     */
    long nextAfter(long miliseconds);

}
