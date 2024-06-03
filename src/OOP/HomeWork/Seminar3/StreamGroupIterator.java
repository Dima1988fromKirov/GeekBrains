package OOP.HomeWork.Seminar3;

import OOP.Seminar3.Student;
import OOP.Seminar3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StreamGroupIterator implements Iterator<Stream> {
    private List<Stream> streamList;
    private  int index = 0;

    public StreamGroupIterator(List<Stream> streamList) {
        this.streamList = streamList;
    }

    @Override
    public void remove() {
        if (hasNext())
            streamList.remove(index);
    }

    @Override
    public boolean hasNext() {
        return index < streamList.size();
    }

    @Override
    public Stream next() {
        if (hasNext())
            return streamList.get(index++);
        return null;
    }
}
