package creational.prototype;

public class Bird implements Clonable<Bird> {
    private String name;
    private String color;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bird() {
    }

    public Bird(Bird old) {
        this.name = old.name;
        this.weight = old.weight;
        this.color = old.color;
    }

    @Override
    public Bird clone() {
        /*
        This soln only works when class that I m cloning is parent class
        Bird clone=new Bird();
        clone.color=this.color;
        clone.weight=weight;
        return clone;
         */
        return new Bird(this);
    }
}
