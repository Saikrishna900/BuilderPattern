package Builder;

public class Laptop {
    private String model;
    private String name;
    private String generation;
    private int ram;
    private String processor;

    public Laptop(String model, String name, String generation, int ram, String processor) {
        this.model = model;
        this.name = name;
        this.generation = generation;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", generation='" + generation + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                '}';
    }
}
