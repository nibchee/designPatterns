package creational.prototype;

public class Sparrow extends Bird {

    private String legSize;

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    public Sparrow() {
        super();
    }

    public Sparrow(Sparrow old) {
        super(old);
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
