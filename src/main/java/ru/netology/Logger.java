package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private SimpleDateFormat dateFormat;

    public void log(String msg) {
        String timestamp = dateFormat.format(new Date());
        System.out.println("[" + timestamp +" " + num++ + "] " + msg);
    }

    private static Logger logger = null;

    private Logger() {
        dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
