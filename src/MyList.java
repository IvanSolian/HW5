import java.util.ArrayList;
import java.util.List;

public class MyList <T extends Number & Comparable<T>> {
    public MyList() {
        arrayList = new ArrayList<>();
    }

    public List<T> arrayList;

    public void add(T parameter) {
        arrayList.add(0, parameter);
    }

    public T maximum() {
        T maximum = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (maximum.compareTo(arrayList.get(i)) < 0) {
                maximum = arrayList.get(i);
            }
        }
        return maximum();
    }


    public T minimum() {
        T minimum = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (minimum.compareTo(arrayList.get(i)) > 0) {
                minimum = arrayList.get(i);
            }

        }
        return minimum();
    }
}



