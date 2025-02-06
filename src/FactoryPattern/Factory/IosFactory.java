package FactoryPattern.Factory;

import FactoryPattern.Button.Button;
import FactoryPattern.Button.IosButton;
import FactoryPattern.Menu.IosMenu;
import FactoryPattern.Menu.Menu;

public class IosFactory implements Factory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
