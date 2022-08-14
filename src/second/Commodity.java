package second;

public class Commodity {
    private String name;
    private double width;
    private double lenght;
    private double weight;

    public Commodity(String name, double width, double lenght, double weight) {
        this.name = name;
        this.width = width;
        this.lenght = lenght;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", lenght=" + lenght +
                ", weight=" + weight +
                '}';
    }
}
