package br.com.nathanalmeida.naskerlib.alarm.serializable;

import br.com.nathanalmeida.naskerlib.alarm.Alarm;

/**
 * Created by Neitan96 on 04/10/2016.
 */
public interface AlarmCustomSerializable extends Alarm{

    /**
     * Deserializa o alarm,
     * essa função é chamada por reflection sem passar pelo construtor da classe.
     *
     * @param alarm Alarm serializado sem o nome do alarm.
     * @throws ExceptionInInitializerError Erro é invacado quando essa função chamada
     *                                     depois que alarm já foi deserializado ou construido.
     */
    void deserialize(String alarm);

    /**
     * Serializa o alarm.
     * Retornando o nome do alarm + espaço + o alarm serializado,
     * o nome pode ser a referencia da classe um aliase adicionado no Alarms.
     * Exemplo:
     * br.com.nathanalmeida.naskerlib.alarm.AlarmDate 04/10/2016 20:00:00
     * AlarmDate 04/10/2016 20:00:00
     *
     * @return Alarm serializado.
     */
    String serialize();

}
