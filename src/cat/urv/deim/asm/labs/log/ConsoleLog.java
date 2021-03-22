package cat.urv.deim.asm.labs.log;


import java.util.Date;

public abstract class ConsoleLog implements ILog, IColorMessage{

    public static final String LogTypeError = " (E) ";
    public static final String LogTypeWarning = " (W) ";
    public static final String LogTypeDebug = " (D) ";
    public static final String LogTypeInfo = " (I) ";
    public static final String LogTypeVerbose = " (V) ";





    //metode auxiliar
    protected static void colorMessage (String tag, String message, String tipo, String color){
        System.out.println(color + dateFormat.format(new Date()) + tipo + tag + ": " + message + ANSI_RESET);
    }

    //metodes estatics
    public static void e(String tag, String message){
        colorMessage(tag, message, LogTypeError, ANSI_RED);
    }

    public static void w(String tag, String message){
        colorMessage(tag, message, LogTypeWarning, ANSI_YELLOW);     //amarillo pq no hay codigo para el naranja
    }

    public static void d(String tag, String message){
        colorMessage(tag, message, LogTypeDebug, ANSI_BLUE);
    }

    public static void i(String tag, String message){
        colorMessage(tag, message, LogTypeInfo, ANSI_BLACK);
    }

    public static void v(String tag, String message){
        colorMessage(tag, message, LogTypeVerbose, ANSI_BLACK);
    }







}
