package cat.urv.deim.asm.labs.core;

import cat.urv.deim.asm.labs.interfaces.IActivity;

public class Dalvik {

    public static void execute(IActivity activity){
        activity.onCreate();
        activity.onStart();
        activity.onResume();
    }

    public static void stop(IActivity activity){
        activity.onPause();
        activity.onStop();
    }

    public static void free(IActivity activity){
        activity.onDestroy();
    }
}
