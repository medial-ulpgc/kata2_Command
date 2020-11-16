package kata2_command;
public class Kata2_Command {
    public static void main(String[] args) {
        
        GamingPadHandler gamingPadHandler = new GamingPadHandler(
            new JumpCommand(),
            new FireGunCommand(),
            new LurchCommand(),
            new SwapWeaponCommand());
        
        while(true)
        gamingPadHandler.handlerInput();
    }
    
}
