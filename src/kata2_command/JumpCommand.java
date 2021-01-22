package kata2_command;


import kata2_command.Command;


public class JumpCommand implements Command{

    private final GameActor gameActor;

    public JumpCommand(GameActor gameActor) {
        this.gameActor = gameActor;
    }

    @Override
    public void execute() {
        System.out.println("jumping");
    }
    
}
