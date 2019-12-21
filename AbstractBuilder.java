package builderModel;

public abstract class AbstractBuilder {
    protected Product p=new Product();
    public abstract void setName();
    public abstract void setSize();
    public abstract  Product getResult();
}
