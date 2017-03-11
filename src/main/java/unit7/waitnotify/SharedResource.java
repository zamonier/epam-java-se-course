package unit7.waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugene on 09.03.17.
 */
public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<>();
    }

    public void setElement(Integer element) {
        list.add(element);
    }

    public Integer getELement() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;

    }
}
