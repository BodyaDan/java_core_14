package second;

import java.util.Comparator;

public class Sorter implements Comparator<Commodity> {
    int sort_n;

    public Sorter(int sort_n) {
        this.sort_n = sort_n; // 1 - name; 2 - Weight; 3 - Width; 4 - Lenght
    }

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (sort_n == 1) {
            if (o1.getName().compareTo(o2.getName()) > 0)
                return 1;
            else if (o1.getName().compareTo(o2.getName()) < 0)
                return -1;
            else {
                if (o1.getWeight() > o2.getWeight())
                    return 1;
                else if (o1.getWeight() < o2.getWeight())
                    return -1;
            }
            return 0;
        }
        if (sort_n == 2) {
            if (o1.getWeight() > o2.getWeight())
                return 1;
            else if (o1.getWeight() < o2.getWeight())
                return -1;
            else {
                if (o1.getName().compareTo(o2.getName()) > 0)
                    return 1;
                else if (o1.getName().compareTo(o2.getName()) < 0)
                    return -1;
            }
            return 0;
        }
        if (sort_n == 3) {
            if (o1.getWidth() > o2.getWidth())
                return 1;
            else if (o1.getWidth() < o2.getWidth())
                return -1;
            else {
                if (o1.getName().compareTo(o2.getName()) > 0)
                    return 1;
                else if (o1.getName().compareTo(o2.getName()) < 0)
                    return -1;
            }
            return 0;
        }
        if (sort_n == 4) {
            if (o1.getLenght() > o2.getLenght())
                return 1;
            else if (o1.getLenght() < o2.getLenght())
                return -1;
            else {
                if (o1.getName().compareTo(o2.getName()) > 0)
                    return 1;
                else if (o1.getName().compareTo(o2.getName()) < 0)
                    return -1;
            }
            return 0;
        }
        return 0;
    }
}
