package TemplateMethod;

public abstract class Car {
    abstract void startEngine();
    abstract void stopEngine();
    public final void start(){
        startEngine();
        stopEngine();
    }
}
