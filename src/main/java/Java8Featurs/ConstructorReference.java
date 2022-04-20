package Java8Featurs;

public class ConstructorReference {

    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMassege("my name is gayatri");
    }
}
