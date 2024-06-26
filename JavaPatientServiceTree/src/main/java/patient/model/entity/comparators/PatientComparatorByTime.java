package patient.model.entity.comparators;


import patient.model.operations.PatientMethod;

import java.util.Comparator;

public class PatientComparatorByTime<T extends PatientMethod> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getTime(), o2.getTime());
    }
}
