package kata2_command;

public class FireGunCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Firing");
    }
    
    
}
