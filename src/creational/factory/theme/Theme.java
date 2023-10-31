package creational.factory.theme;

//Step-1 Create parent class
//Step-4 Add Factory Method
public abstract class Theme {
    private String name;
    private String primaryColour;
    private String authorName;

    public abstract ThemeComponentFactory createComponentFactory();

}
