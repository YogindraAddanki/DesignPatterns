package FactoryPattern;

import FactoryPattern.Button.Button;
import FactoryPattern.Factory.Factory;
import FactoryPattern.Menu.Menu;

public class Client {

    public static void main(String[] args) {

         FactoryUtil factoryUtil = new FactoryUtil();
         Factory factory = factoryUtil.factoryType(OSType.ANDROID);
         Button button = factory.createButton();
         button.displayButton();
         Menu menu = factory.createMenu();
         menu.showMenu();

    }
}
