package com.designpatterns.behavioral.command_pattern;

public class CommandPatternClient {
    public static void main(String[] args) {
        Document document = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(document);
        ActionListenerCommand clickSave = new ActionSave(document);

        MenuOptions menuOptions = new MenuOptions(clickOpen, clickSave);

        menuOptions.clickOpen();
        menuOptions.clickSave();
    }
}
