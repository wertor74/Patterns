package Prototype;

public class ComplicatedObject implements Copyable{
    private Type type;
    public enum Type {
        ONE, TWO
    }
    @Override
    public ComplicatedObject copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        return complicatedobject;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
