package OOP.HomeWork.Seminar3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<String> {
    List<String> streams;
    private int index;

    public StreamIterator(List<String> streams) {
        this.streams = streams;
    }

    @Override
    public void remove() {
        if (hasNext())
            streams.remove(index);
    }

    @Override
    public boolean hasNext() {
        return index < streams.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return streams.get(index++);
        }
        return null;
    }
}
