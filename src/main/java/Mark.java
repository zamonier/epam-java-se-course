


public class Mark<T extends Number> {
    private final Class clazz1;
    public T mark;

    public Mark(T value, Class clazz) {
        mark = value;
        clazz1 = clazz;
    }

    public T getMark() {
        return mark;
    }

    public int roundMark() {
        return Math.round(mark.floatValue());
    }

    /* вместо */ // public boolean sameAny (Mark<T> ob) {
    public boolean sameAny(Mark<?> ob) {
        Number mark = ob.getMark();
        System.out.printf(this.mark.getClass().toString());
        return roundMark() == ob.roundMark();
    }

    public boolean same(Mark<T> ob) {
        return getMark() == ob.getMark();
    }

    public static void main(String[] args) {
        Mark<Integer> integerMark = new Mark<Integer>(1, Integer.class);
        Mark<Double> mark1 = new Mark<Double>(1.0d, Float.class);
        integerMark.sameAny(mark1);
    }
}