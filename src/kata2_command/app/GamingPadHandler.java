package kata2_command.app;

import kata2_command.Model.GamingPadButton;
import kata2_command.controller.Command;
import kata2_command.controller.NullCommand;
import java.util.HashMap;
import java.util.Map;
public class GamingPadHandler {

private final Command defaultCommand = new NullCommand();
private final Map<String, GamingPadButton> buttons = new HashMap<>();
private final Map<GamingPadButton, Command> actions = new HashMap<>();

    public GamingPadHandler() {
        addButtons();
    }

    public void handlerInput() {
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
