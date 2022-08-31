import java.util.Iterator;
import java.util.LinkedList;

public class SortedList<T extends Comparable<? super T>> implements List<T>, Iterable<T> {
    protected LinkedList<T> list = new LinkedList<T>();

    /* more interesting code here, hear? */
}
