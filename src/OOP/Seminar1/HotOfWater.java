package OOP.Seminar1;

public class HotOfWater extends BottleOfWater{
    private int temperature;
    public HotOfWater(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public String toString() {
        return "HotOfWater{" +
                "name='" + super.getName() + '\'' +
                "volume='" + super.getVolume() + '\'' +
                ", cost=" + super.getCost() +
                ", temperature=" + this.getTemperature() +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }

}
