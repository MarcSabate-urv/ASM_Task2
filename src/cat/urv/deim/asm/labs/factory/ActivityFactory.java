package cat.urv.deim.asm.labs.factory;

import cat.urv.deim.asm.labs.interfaces.IActivity;
import cat.urv.deim.asm.labs.log.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ActivityFactory {

    public static IActivity build(Class<?> activityClass)
            throws IllegalAccessException, InvocationTargetException,InstantiationException {
        Constructor<?>[] declaredConstructors = activityClass.getDeclaredConstructors();
        Constructor<?> ctor = declaredConstructors[0];
            Log.i("Activity", "constructor");
        return (IActivity) ctor.newInstance();

    }

    public static IActivity build(String name)
            throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(name);
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        Constructor<?> ctor = declaredConstructors[0];
            Log.i("Activity", "constructor");
        return (IActivity) ctor.newInstance();
    }
}