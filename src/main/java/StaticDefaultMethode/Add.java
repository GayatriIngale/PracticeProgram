package StaticDefaultMethode;

public interface Add {
    default  void add(int a, int b){
        System.out.println(a+b);
    }
    void say();
}
