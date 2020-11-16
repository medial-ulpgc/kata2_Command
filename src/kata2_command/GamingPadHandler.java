package kata2_command;
public class GamingPadHandler {

private final GamingPadButton buttonA = new GamingPadButtonHandler("A");
private final GamingPadButton buttonB = new GamingPadButtonHandler("B");
private final GamingPadButton buttonY = new GamingPadButtonHandler("Y");
private final GamingPadButton buttonX = new GamingPadButtonHandler("X");
private final Command buttonACommand, buttonBCommand, buttonYCommand, buttonXCommand;

    public GamingPadHandler(Command buttonACommand, Command buttonBCommand, Command buttonYCommand, Command buttonXCommand) {
        this.buttonACommand = buttonACommand;
        this.buttonBCommand = buttonBCommand;
        this.buttonYCommand = buttonYCommand;
        this.buttonXCommand = buttonXCommand;
    }


    void handlerInput() {
        if(this.buttonA.isPressed())buttonACommand.execute();
        if(this.buttonB.isPressed())buttonBCommand.execute();
        if(this.buttonX.isPressed())buttonYCommand.execute();
        if(this.buttonY.isPressed())buttonXCommand.execute();
    }

    private void swapWeapon() {
        System.out.println("WeaponSwapped");
    }

    private void lurch() {
        System.out.println("lurch");
    }

    private void jump() {
        System.out.println("jump");
    }

    private void fire() {
        System.out.println("fireGun");
    }
    
}
