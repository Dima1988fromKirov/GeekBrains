package OOP.HomeWork.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<Stream> streams = new ArrayList<>();
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));
        streams.add(new Stream(generateGroup()));

        for (Stream stream: streams){
            System.out.println(stream);
        }
        System.out.println();

        StreamService streamService = new StreamService(streams);
        streamService.sortStream();






        }

        static List<String> generateGroup(){
        Random random = new Random();
        String[] namesGroup = {"Аналитики","Программисты","Продакт Менеджеры",
                "Маркетологи","Тестировщики","Дизайнеры","Машинное обучение"};
        List<String> list = new ArrayList<>();
        int size = random.nextInt(4,15);
            for (int i = 0; i < size; i++) {
                list.add(namesGroup[random.nextInt(0,7)]);
            }
        return list;
        }


}
