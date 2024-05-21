package OOP.HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    List<Stream> streams;

    public StreamService(List<Stream> streams) {
        this.streams = streams;
    }

    public void sortStream(){
        List<Stream> list = new ArrayList<>(streams);
        Collections.sort(list);

        for (Stream stream: list){
            System.out.println(stream);
        }
    }
}
