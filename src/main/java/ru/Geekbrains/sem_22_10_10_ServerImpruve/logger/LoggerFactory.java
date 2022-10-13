package ru.Geekbrains.sem_22_10_10_ServerImpruve.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
