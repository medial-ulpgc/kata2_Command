package kata2_command.app;

import kata2_command.Model.GamingPadButton;

public class GamingPadButtonHandler implements GamingPadButton {
private final String buttonID;

    public GamingPadButtonHandler(String buttonID) {
        this.buttonID = buttonID;
    }

    @Override
    public boolean isPressed() {
    final double random = Math.random();
    boolean pressed = random<(1./1000000000);
        
        return pressed;
        
    }

}
