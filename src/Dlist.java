import java.util.Iterator;
import java.util.LinkedList;

public class DList<T> implements List<T>, Iterable<T> {
    protected LinkedList<T> list = new LinkedList<T>();

    public int size() {  return list.size();  }
    
    /* more interesting code here, hear? */

}
