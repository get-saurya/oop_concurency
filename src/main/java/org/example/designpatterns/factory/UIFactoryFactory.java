package org.example.designpatterns.factory;

// this class which will help you to get the corresponding object of uiFactory

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform) {
        if(platform.equals(Platform.IOS)){
            return new IOSUiFactory();
        } else if(platform.equals(Platform.Android)){
            return new AndroidUIFactory();
        } else if(platform.equals(Platform.Mac)){
            return new MacUiFactory();
        } else if(platform.equals(Platform.Windows)){
            return new WindowsUiFactory();
        }
        return null;
    }
}
