package FactoryMethod;

public class Factory {
    public OS getCurrentOS(String inputOS) {
        OS os = null;
        if (inputOS.equals("windows")) {
            os = new WindowsOS();
        } else if (inputOS.equals("linux")) {
            os = new LinuxOS();
        } else if (inputOS.equals("mac")) {
            os = new MacOS();
        }
        return os;
    }
}
