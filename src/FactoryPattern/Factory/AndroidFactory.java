package FactoryPattern.Factory;

import FactoryPattern.Button.AndroidButton;
import FactoryPattern.Button.Button;
import FactoryPattern.Menu.AndroidMenu;
import FactoryPattern.Menu.Menu;

public class AndroidFactory implements Factory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
