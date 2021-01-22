package kata2_command;
public class Main {
    public static void main(String[] args) {
        
        GamingPadHandler gamingPadHandler = new GamingPadHandler( ()->new NullCommand() );
        
        gamingPadHandler.addCommand("A", new JumpCommand());
        gamingPadHandler.addCommand("B", new FireGunCommand());
        gamingPadHandler.addCommand("Y", new LurchCommand());
        gamingPadHandler.addCommand("X", new SwapWeaponCommand());
        
        while(true)
            gamingPadHandler.handlerInput();
    }
    
}
