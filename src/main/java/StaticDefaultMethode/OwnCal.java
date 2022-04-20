package StaticDefaultMethode;

public class OwnCal implements  Add {
    @Override
   public void add(int a, int b){
        System.out.println("This is my own addition: "+(a*b));
    }

    @Override
    public void say() {

    }

    public static void main(String[] args) {
        OwnCal o = new OwnCal();
        o.add(2,3);
    }

}
