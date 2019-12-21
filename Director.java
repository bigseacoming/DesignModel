package builderModel;

public class Director extends AbstractDirector {

    public Director(AbstractBuilder b){
        this.builder=b;
    }

    public Product getResult(){
        builder.setName();
        builder.setSize();
        return builder.getResult();
    }
}
