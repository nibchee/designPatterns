package creational.factory.theme.dark;

import creational.factory.theme.Button;
import creational.factory.theme.Menu;
import creational.factory.theme.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
