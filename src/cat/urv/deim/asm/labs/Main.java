package cat.urv.deim.asm.labs;

import cat.urv.deim.asm.labs.core.Dalvik;
import cat.urv.deim.asm.labs.factory.ActivityFactory;
import cat.urv.deim.asm.labs.interfaces.IActivity;
import cat.urv.deim.asm.labs.activity.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("Execució primera activity");
        System.out.println("========================");
        IActivity mainActivity = ActivityFactory.build(MainActivity.class.getName());
        Dalvik.execute(mainActivity);

        System.out.println("\n");

        System.out.println("Execució segona activity");
        System.out.println("========================");
        IActivity mainActivity2 = ActivityFactory.build(MainActivity.class);
        Dalvik.execute(mainActivity2);
        Dalvik.stop(mainActivity2);
        Dalvik.free(mainActivity2);

    }
}