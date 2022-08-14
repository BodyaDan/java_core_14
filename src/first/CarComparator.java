package first;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getModel().compareTo(o2.getModel()) > 0)
            return 1;
        else if (o1.getModel().compareTo(o2.getModel()) < 0)
            return -1;
        else {
            if(o1.getMaxSpeed() > o2.getMaxSpeed())
                return 1;
            else if (o1.getMaxSpeed() < o2.getMaxSpeed())
                return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
