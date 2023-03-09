package TemplateMethod;

public class TwoCar extends Car{
    @Override
    void startEngine() {
        System.out.println("TwoCar Start engine.");
    }
    @Override
    void stopEngine() {
        System.out.println("TwoCar Stop engine.");
    }
}
