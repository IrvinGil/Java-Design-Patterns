package com.designpatterns.behavioral.command_pattern;

public class ActionSave implements ActionListenerCommand {
    private final Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
