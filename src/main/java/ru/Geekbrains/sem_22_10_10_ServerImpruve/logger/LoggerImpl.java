package ru.Geekbrains.sem_22_10_10_ServerImpruve.logger;

class LoggerImpl implements Logger {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
