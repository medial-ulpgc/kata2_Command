package kata2_command.controller;


import kata2_command.Model.GameActor;
import kata2_command.controller.Command;


public class SwapWeaponCommand implements Command{

    private final GameActor gameActor;

    public SwapWeaponCommand(GameActor gameActor) {
        this.gameActor = gameActor;
    }

    @Override
    public void execute() {
        gameActor.swapWeapon();
    }
    
}
