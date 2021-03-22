package cat.urv.deim.asm.labs.log;

public class Log extends ConsoleLog implements ILog, IColorMessage{
    public Log(){
    }

    //metodes d'instancia
    public void error(String tag, String message){
        Log.e(tag, message);
    }
    public void warning(String tag, String message){
        Log.w(tag, message);
    }
    public void debug(String tag, String message){
        Log.d(tag, message);
    }
    public void info(String tag, String message){
        Log.i(tag, message);
    }
    public void verbose(String tag, String message){
        Log.v(tag, message);
    }



}
