package kata2_command;


import kata2_command.Command;

public class FireGunCommand implements Command{

    @Override
    public void execute() {
        System.out.println("pium!");
    }
    
    
}
