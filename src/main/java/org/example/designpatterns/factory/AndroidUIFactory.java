package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.AndroidButton;
import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.menu.AndroidMenu;
import org.example.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
