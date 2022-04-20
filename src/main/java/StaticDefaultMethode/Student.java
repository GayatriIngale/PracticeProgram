package StaticDefaultMethode;

public interface Student {

    default  void show(){
        System.out.println("This is default");
    }

    static  void print(){
        System.out.println("Static method");
    }

    void say();

}
