package builderModel;

public class MainTest {
    public static void main(String[] args) {
        Builder2 builder = new Builder2();
        Director director = new Director(builder);
        Product result = director.getResult();
        System.out.println(result.getName());
        System.out.println(result.getSize());

    }
}
