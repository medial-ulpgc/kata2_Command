package kata2_command.app;

import kata2_command.*;


public class Main {
    public static void main(String[] args) {
        GameActor archer = new GameActor() {
            @Override
            public void jump() {
                System.out.println("archer jumps");
            }

            @Override
            public void swapWeapon() {
                System.out.println("archer changes his weapon");
            }

            @Override
            public void fire() {
                System.out.println("archer throws an arrow");
            }

            @Override
            public void lurch() {
                System.out.println("archer lurches");
            }
        };
        
        GamingPadHandler gamingPadHandler = new GamingPadHandler( ()->new NullCommand() );
        
        gamingPadHandler.addCommand("A", new JumpCommand(archer));
        gamingPadHandler.addCommand("B", new FireGunCommand(archer));
        gamingPadHandler.addCommand("Y", new LurchCommand(archer));
        gamingPadHandler.addCommand("X", new SwapWeaponCommand(archer));
        
        while(true)
            gamingPadHandler.handlerInput();
    }
    
}
