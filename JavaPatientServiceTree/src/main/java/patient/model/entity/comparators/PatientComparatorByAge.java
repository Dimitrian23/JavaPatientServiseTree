package patient.model.entity.comparators;

import patient.model.operations.PatientMethod;

import java.util.Comparator;

public class PatientComparatorByAge <T extends PatientMethod> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
