package kata2_command;

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
