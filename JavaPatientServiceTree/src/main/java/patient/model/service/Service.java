package patient.model.service;

import patient.model.entity.Patient;
import patient.model.operations.PatientListManager;

public class Service {
    private PatientListManager<Patient> group;

    public Service() {
        group = new PatientListManager<>();
    }

    public void addPatient(String name, int age,int time,boolean isInList){
        Patient patient = new Patient( name, age,time,isInList);
        group.addPatient(patient);
    }

    public String getPatientInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список пациентов:\n");


        for (Patient patient: group){
            stringBuilder.append(patient);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        group.sortByName();
    }

    public void sortByTime(){
        group.sortByTime();
    }
    public void sortByAge(){
        group.sortByAge();
    }
}