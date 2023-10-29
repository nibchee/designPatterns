package creational.prototype;

public class Crow extends Bird {
    private String sound = "Kaw";

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow() {
        super();
    }

    private Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
        // Bird cloneParent=super.clone();
        return new Crow(this);
    }
}
