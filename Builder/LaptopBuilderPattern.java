package Builder;

public class LaptopBuilderPattern {
    private String model;
    private String name;
    private String generation;
    private int ram;
    private String processor;

    public LaptopBuilderPattern setModel(String model) {
        this.model = model;
        return this;
    }

    public LaptopBuilderPattern setName(String name) {
        this.name = name;
        return this;
    }

    public LaptopBuilderPattern setGeneration(String generation) {
        this.generation = generation;
        return this;
    }

    public LaptopBuilderPattern setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilderPattern setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public Laptop getLaptopProperties(){
        return new Laptop(model,name,generation,ram,processor);
    }
}
