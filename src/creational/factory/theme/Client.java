package creational.factory.theme;

import creational.factory.theme.primary.PrimaryTheme;

public class Client {
    public static void main(String[] args) {
        Theme primaryTheme=new PrimaryTheme();
        ThemeComponentFactory themeComponentFactory=primaryTheme.createComponentFactory();
        themeComponentFactory.createButton();
        themeComponentFactory.createMenu();
    }
}
