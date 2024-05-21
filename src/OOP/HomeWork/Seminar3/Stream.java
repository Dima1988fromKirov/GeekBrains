package OOP.HomeWork.Seminar3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Comparable<Stream>, Iterable<String> {
    List<String> groups;

    public Stream(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return String.format("Кол-во груп: %d %s", groupSize(), groups);
    }

    public Integer groupSize(){
        return groups.size();
    }

    public List<String> getGroups() {
        return groups;
    }

    @Override
    public int compareTo(Stream o) {
        return this.groupSize().compareTo(o.groupSize());
    }

    @Override
    public Iterator<String> iterator() {
        return new StreamIterator(groups);
    }
}
