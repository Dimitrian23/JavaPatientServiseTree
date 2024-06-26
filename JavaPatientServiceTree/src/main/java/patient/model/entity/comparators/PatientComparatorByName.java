package patient.model.entity.comparators;


import patient.model.operations.PatientMethod;

import java.util.Comparator;

public class PatientComparatorByName <T extends PatientMethod> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
