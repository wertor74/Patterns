package FactoryMethod;

public class LinuxOS implements OS{
    @Override
    public void getOS() {
        System.out.println("применить для линукс");
    }
}
