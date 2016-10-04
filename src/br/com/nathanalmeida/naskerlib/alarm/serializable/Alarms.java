package br.com.nathanalmeida.naskerlib.alarm.serializable;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Neitan96 on 04/10/2016.
 */
public final class Alarms{

    private final static Map<String, Class<? extends AlarmCustomSerializable>> aliases = new HashMap<>();

    public static void setAliase(String aliase, Class<? extends AlarmCustomSerializable> aClass){
        if(aClass == null)
            aliases.remove(aliase);
        else
            aliases.put(aliase, aClass);
    }

    public static AlarmCustomSerializable getAlarm(Class<? extends AlarmCustomSerializable> aClass, String alarmSerialized){
        try{
            ReflectionFactory factory = ReflectionFactory.getReflectionFactory();
            Constructor<?> constructorObj = Object.class.getDeclaredConstructors()[0];
            Constructor<?> constructorFactored = factory.newConstructorForSerialization(aClass, constructorObj);
            Object instanceFactored = constructorFactored.newInstance();
            AlarmCustomSerializable alarm = aClass.cast(instanceFactored);
            alarm.deserialize(alarmSerialized);
            return alarm;
        }catch(InstantiationException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
            return null;
        }
    }

    public static AlarmCustomSerializable getAlarm(String alarm){
        try{
            String[] split = alarm.split(" ", 2);
            //noinspection unchecked
            Class<? extends AlarmCustomSerializable> aClass = aliases.containsKey(split[0]) ?
                    aliases.get(split[0]) : (Class<? extends AlarmCustomSerializable>) Class.forName(split[0]);
            if(aClass != null){
                return getAlarm(aClass, split[1]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private Alarms(){
    }

}
