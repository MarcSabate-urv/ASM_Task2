package cat.urv.deim.asm.labs.activity;

import cat.urv.deim.asm.labs.log.Log;

public class MainActivity extends Activity{
    public void onCreate(){
        Log.i("Activity","onCreate");
    }
    public void onStart(){
        Log.i("Activity","onStart");
    }
    public void onResume(){
        Log.i("Activity","onResume");
    }
    public void onPause(){
        Log.i("Activity","onPause");
    }
    public void onStop(){
        Log.i("Activity","onStop");
    }
    public void onDestroy(){
        Log.i("Activity","onDestroy");
    }
}
