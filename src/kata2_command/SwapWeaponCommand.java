package kata2_command;


import kata2_command.Command;


public class SwapWeaponCommand implements Command{

    private final GameActor gameActor;

    public SwapWeaponCommand(GameActor gameActor) {
        this.gameActor = gameActor;
    }

    @Override
    public void execute() {
        gameActor.fire();
    }
    
}
