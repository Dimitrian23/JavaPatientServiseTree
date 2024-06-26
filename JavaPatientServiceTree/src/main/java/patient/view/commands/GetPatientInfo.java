package patient.view.commands;

import patient.view.ConsoleUI;

public class GetPatientInfo extends Command {
    private ConsoleUI consoleUI;

    public GetPatientInfo(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public void execute() {
        consoleUI.getPatientInfo();
    }

    @Override
    public String getDescription() {
        return "Get patient info by ID";
    }
}