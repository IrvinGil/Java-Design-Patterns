package com.designpatterns.behavioral.command_pattern;

public class ActionOpen implements ActionListenerCommand {
    private final Document document;

    public ActionOpen(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
