package kata2_command;


import kata2_command.Command;


public class JumpCommand implements Command{

    @Override
    public void execute() {
        System.out.println("jumping");
    }
    
}
