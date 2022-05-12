package business;

import java.util.ArrayList;

public class MagasinManager {
    public void displayArrayList(ArrayList<?> arrayList) {
        for (Object o: arrayList) {
            System.out.println(o);
        }
    }
}
