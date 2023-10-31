package creational.factory.theme.primary;

import creational.factory.theme.Button;
import creational.factory.theme.Menu;
import creational.factory.theme.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
