package creational.factory.theme.primary;

import creational.factory.theme.Theme;
import creational.factory.theme.ThemeComponentFactory;

//Step-2 Create Subclasses
public  class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
return  new PrimaryThemeFactory();
    }
}
