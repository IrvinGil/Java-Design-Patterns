package com.designpatterns.behavioral.command_pattern;

public class MenuOptions {
    ActionListenerCommand openCommand;
    ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand openCommand, ActionListenerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
