package comand;

public class User {

    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startCommand() {
        start.execute();
    }

    void stopCommand() {
        stop.execute();
    }

    void resetCommand() {
        reset.execute();
    }
}
