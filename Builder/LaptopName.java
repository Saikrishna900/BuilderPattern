package Builder;

public class LaptopName {
    public static void main(String[] args) {
       // Laptop l = new Laptop("VivoBook","Asus","8th",8,"i5");
        Laptop l = new LaptopBuilderPattern().setName("Asus").setModel("Vivobook").getLaptopProperties();
        System.out.println(l);
    }
}
