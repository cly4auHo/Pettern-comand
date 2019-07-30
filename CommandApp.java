package comand;

public class CommandApp {

    public static void main(String[] args) {

        Comp c = new Comp();
        User u = new User(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        u.startCommand();
        u.resetCommand();
        u.stopCommand();
    }
}
