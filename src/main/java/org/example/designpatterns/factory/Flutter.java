package org.example.designpatterns.factory;

public class Flutter {
    //non factory method
    void refreshUi(){
        System.out.println("Refreshing UI from flutter");
    }

    void setTheme(){
        System.out.println("Setting theme from flutter");
    }

    //Factory method to get the object of corresponding UI Factory
    public UIFactory getUIFactory(Platform platform){
        //code moved to helper class named UIFactoryFactory because this is main class so instead of violating(srp/ocp) main class we moved code to the helper class
        return UIFactoryFactory.getUIFactory(platform);
    }
}
