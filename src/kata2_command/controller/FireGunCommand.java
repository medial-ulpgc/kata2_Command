package kata2_command.controller;

import kata2_command.controller.Command;
import kata2_command.Model.GameActor;

public class FireGunCommand implements Command{

    private final GameActor gameActor;

    public FireGunCommand( GameActor gameActor) {
        this.gameActor = gameActor;
    }
    
    @Override
    public void execute() {
        gameActor.fire();
    }
    
    
}
