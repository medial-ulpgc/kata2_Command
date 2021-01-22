package kata2_command;


import kata2_command.Command;


public class LurchCommand implements Command{

    private final GameActor gameActor;

    public LurchCommand(GameActor gameActor) {
        this.gameActor = gameActor;
    }

    @Override
    public void execute() {
        System.out.println("lurching");
    }
    
}
