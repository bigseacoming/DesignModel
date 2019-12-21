package builderModel;

public class Builder extends AbstractBuilder {
    public void setName() {
        this.p.setName("Product name is A");
    }

    public void setSize() {
this.p.setSize("Product size is 1");
    }

    public Product getResult() {
        return p;
    }
}
