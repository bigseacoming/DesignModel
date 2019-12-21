package builderModel;

public class Builder2 extends AbstractBuilder {
    public void setName() {
        this.p.setName("Product name is B");
    }

    public void setSize() {
this.p.setSize("Product size is 2");
    }

    public Product getResult() {
        return p;
    }
}
