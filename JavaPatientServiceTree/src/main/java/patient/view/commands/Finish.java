package patient.view.commands;

import patient.view.ConsoleUI;

public class Finish extends  Command{
    @Override
    public void execute(){
        consoleUI.finish();
    }

    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Закончить лечение";
    }
}
