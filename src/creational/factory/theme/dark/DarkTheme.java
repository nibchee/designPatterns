package creational.factory.theme.dark;

import creational.factory.theme.Theme;
import creational.factory.theme.ThemeComponentFactory;

//Step-2 Create Subclasses
public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkThemeFactory();
    }
}
