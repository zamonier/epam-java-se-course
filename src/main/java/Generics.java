/**
 * Created by Eugene on 14.02.17.
 */
public class Generics {

    public class Mark<T extends Number> { public T mark;
        public Mark (T value) {
            mark = value;
        }
        public T getMark () { return mark;
        }
        public int roundMark () {
            return Math.round(mark.floatValue ()); }
        /* вместо */ // public boolean sameAny (Mark<T> ob) {
        public boolean sameAny (Mark<?> ob) {
            return roundMark () == ob.roundMark ();
        }
        public boolean same (Mark<T> ob) {
            return getMark () == ob.getMark (); }
    }
}
