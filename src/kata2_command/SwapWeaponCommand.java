package kata2_command;


import kata2_command.Command;


public class SwapWeaponCommand implements Command{

    @Override
    public void execute() {
        System.out.println("changing selected weapon");
    }
    
}
