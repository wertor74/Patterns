package TemplateMethod;

public class OneCar extends Car{
    @Override
    void startEngine() {
        System.out.println("OneCar Start engine.");
    }
    @Override
    void stopEngine() {
        System.out.println("OneCar Stop engine.");
    }
}
