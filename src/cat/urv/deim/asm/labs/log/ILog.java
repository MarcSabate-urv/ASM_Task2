package cat.urv.deim.asm.labs.log;

import java.text.SimpleDateFormat;

public interface ILog {

    void error(String tag, String message);
    void warning(String tag, String message);
    void debug(String tag, String message);
    void info(String tag, String message);
    void verbose(String tag, String message);

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");


}
