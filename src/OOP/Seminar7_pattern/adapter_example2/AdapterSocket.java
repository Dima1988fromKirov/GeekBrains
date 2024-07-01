package OOP.Seminar7_pattern.adapter_example2;

public class AdapterSocket implements EuroSocket {
    AmericanSocket americanSocket;

    public AdapterSocket(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}
