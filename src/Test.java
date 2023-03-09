import AbstractFactory.InteAbsFactory;
import AbstractFactory.Lada;
import AbstractFactory.RuCarPriceAbsFactory;
import AbstractFactory.UaCarPriceAbsFactory;
import Adapter.ABank;
import Adapter.PBank;
import Adapter.PBankAdapter;
import Builder.Build;
import ChainOfResponsibility.PayPalPayment;
import ChainOfResponsibility.Payment;
import ChainOfResponsibility.VisaPayment;
import Decorator.BlueCarDecorator;
import Decorator.Car;
import Decorator.SportCar;
import Decorator.UnknownCar;
import FactoryMethod.Factory;
import FactoryMethod.OS;
import Iterator.Iterator;
import Iterator.Numbers;
import Prototype.ComplicatedObject;
import Proxy.Image;
import Proxy.ProxyImage;
import Singleton.Singleton;
import TemplateMethod.OneCar;
import TemplateMethod.TwoCar;

public class Test {
    public static void main(String[] args) {
/*
        Singleton singelton = Singleton.getInstance();
        singelton.setUp();
        Build build = new Build(2);
        build.buildCar();
        String win = "mac";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
        String country = "RU";
        InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new UaCarPriceAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new RuCarPriceAbsFactory();
        }
        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
        PBank pbank = new PBank();
        pbank.getBalance();
        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        TemplateMethod.Car car1 = new OneCar();
        car1.start();
        System.out.println();
        TemplateMethod.Car car2 = new TwoCar();
        car2.start();
*/
        Payment visaPayment = new VisaPayment();
        Payment payPalPayment = new PayPalPayment();
        visaPayment.setNext(payPalPayment);
        visaPayment.pay();
    }
}