package kata2_command;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class GamingPadHandler {

private final Command defaultCommand;
private final Map<String, GamingPadButton> buttons = new HashMap<>();
private final Map<GamingPadButton, Command> actions = new HashMap<>();

    GamingPadHandler(Supplier<Command> defaultCommandSupplier) {
        defaultCommand =  defaultCommandSupplier.get();
        addButtons();
    }

    void handlerInput() {
        buttons.values().forEach(this::handleButton);
    }
    private void handleButton(GamingPadButton button) {
        if(button.isPressed())actions.getOrDefault(button,defaultCommand ).execute();
    }

    private void addButtons() {
        buttons.put("A",new GamingPadButtonHandler("A"));
        buttons.put("B",new GamingPadButtonHandler("B"));
        buttons.put("Y",new GamingPadButtonHandler("Y"));
        buttons.put("X",new GamingPadButtonHandler("X"));
    }
    public void addCommand(String buttonName, Command command){
        if(buttons.containsKey(buttonName)){
            actions.put(buttons.get(buttonName), command);   
        }
    }
}
