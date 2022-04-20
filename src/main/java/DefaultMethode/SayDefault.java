package DefaultMethode;


public interface SayDefault {

    void say();

    default void saysomething(){
        System.out.println("this is default methode");
    }

    static  void  sayLouder(){
        System.out.println("static Methode");
    }
}
