package kata2_command.app;

import kata2_command.controller.SwapWeaponCommand;
import kata2_command.controller.JumpCommand;
import kata2_command.controller.FireGunCommand;
import kata2_command.controller.LurchCommand;
import kata2_command.Model.GameActor;
import kata2_command.view.GameActorCommandLine;


public class Main {
    public static void main(String[] args) {
        GameActor archer = new GameActorCommandLine("Player 1");
        
        GamingPadHandler gamingPadHandler = new GamingPadHandler();
        
        gamingPadHandler.addCommand("A", new JumpCommand(archer));
        gamingPadHandler.addCommand("B", new FireGunCommand(archer));
        gamingPadHandler.addCommand("Y", new LurchCommand(archer));
        gamingPadHandler.addCommand("X", new SwapWeaponCommand(archer));
        
        while(true)
            gamingPadHandler.handlerInput();
    }
    
}
