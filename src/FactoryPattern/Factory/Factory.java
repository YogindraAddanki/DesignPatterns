package FactoryPattern.Factory;

import FactoryPattern.Button.Button;
import FactoryPattern.Menu.Menu;

public interface Factory {
    Button createButton();
    Menu createMenu();
}
