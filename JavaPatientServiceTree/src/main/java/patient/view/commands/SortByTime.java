package patient.view.commands;

import patient.view.ConsoleUI;

public class SortByTime extends  Command{
    @Override
    public void execute(){
        consoleUI.sortByTime();
    }

    public SortByTime(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список пациентов  по времени приема";
    }
}
