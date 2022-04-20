package Java8Featurs;

public class Message {
    Message(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.getMassege("hey are you ready for next step?");
    }
}
