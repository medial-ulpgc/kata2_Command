package kata2_command.view;

import kata2_command.Model.GameActor;

public class GameActorCommandLine implements GameActor{

    private final String Name;
    private Status status=Status.Null;

    public GameActorCommandLine(String Name) {
        this.Name = Name;
    }

    @Override
    public void jump() {
        statusReport(Status.Jumping);
    }

    @Override
    public void swapWeapon() {
        statusReport(Status.SwapingWeapon);
    }

    @Override
    public void fire() {
        
        statusReport(Status.Firing);
    }

    @Override
    public void lurch() {
        statusReport(Status.Lurching);
    }

    private void statusReport(Status status) {
        this.status = status;
        update();
        this.status = Status.Null;
    }
    private void update( ) {
        System.out.println("["+ Name+"] " + status.getMessage() );
    }
    
    private static enum Status {
            Null(""),
            Jumping( "I'm jumping."),
            Lurching("I'm lurching."),
            Firing("I'm firing against the enemy."),
            SwapingWeapon("I'm changing my weapon.");
            
            private final String message;

        public String getMessage() {
            return message;
        }
            
            private Status(String message){
                this.message = message;
            }
        
    }
    
}
