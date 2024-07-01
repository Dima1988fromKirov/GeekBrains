package OOP.Seminar7_pattern.adapter_example2;

public class Program {
    public static void main(String[] args) {
        AmericanSocket americanSocket =  new SimpleAmericanSocket();
        EuroSocket euroSocket = new AdapterSocket(americanSocket);

        Radio radio =  new Radio();
        radio.listenMusic(euroSocket);

    }
}
