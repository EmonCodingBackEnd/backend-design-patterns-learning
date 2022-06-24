package com.coding.design.patterns.behavioral.p19command.example1;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
