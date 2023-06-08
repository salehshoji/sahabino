package ir.saleh;

import java.time.LocalDateTime;

public class Log {
    LocalDateTime dateTime;
    String logNum;
    String threadName;
    String status;
    String packageName;
    String classname;
    String message;
    String component;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLogNum() {
        return logNum;
    }

    public String getThreadName() {
        return threadName;
    }

    public String getStatus() {
        return status;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getClassname() {
        return classname;
    }

    public String getMessage() {
        return message;
    }

    public String getComponent() {
        return component;
    }

    public Log(String component, String dateTime, String logNum, String threadName,
               String status, String packageName, String classname, String message) {
        this.dateTime = LocalDateTime.parse(dateTime);
        this.logNum = logNum;
        this.threadName = threadName;
        this.status = status;
        this.packageName = packageName;
        this.classname = classname;
        this.message = message;
        this.component = component;
    }
}
