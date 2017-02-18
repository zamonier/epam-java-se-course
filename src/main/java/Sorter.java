import java.util.Arrays;

@SuppressWarnings("ALL")
public class Sorter {

    public String[] sortDesc(String[] zoo) {
        String[] result = Arrays.copyOf(zoo, zoo.length);
        Arrays.sort(result, (o1, o2) -> -o1.compareTo(o2));
        return result;
    }


}
