package cat.urv.deim.asm.labs.factory;

import cat.urv.deim.asm.labs.interfaces.IActivity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ActivityFactory {

    public static IActivity build(Class<?> activiyClass)
            throws IllegalAccessException, InvocationTargetException,InstantiationException {
        Constructor<?>[] declaredConstructors = activiyClass.getDeclaredConstructors();
        Constructor<?> ctor = declaredConstructors[0];
        return (IActivity) ctor.newInstance();

    }

    public static IActivity build(String name)
            throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(name);
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        Constructor<?> ctor = declaredConstructors[0];
        return (IActivity) ctor.newInstance();
    }
}