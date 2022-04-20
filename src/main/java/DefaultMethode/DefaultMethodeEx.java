package DefaultMethode;

public class DefaultMethodeEx {
    public static void main(String[] args) {
      SayDefault sayDefault = () -> System.out.println("This is abstract methode");

      sayDefault.say();
      sayDefault.saysomething();
      SayDefault.sayLouder();

    }
}
