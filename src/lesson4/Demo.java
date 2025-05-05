package lesson4;

public class Demo {

    public static void main(String[] args) {

        // 介面(interface)範例

        // Bird bird = new Bird();
        // bird.fly();
        // bird.circle();
        // bird.eat();

        // Dragon dragon = new Dragon();
        // dragon.fly();
        // dragon.circle();
        // dragon.eat();


        //抽象

        Notification email = new EmailNotification("aa@gmail.com");
        email.send();
        email.log();

        Notification sms = new SmsNotification("0900123456");
        sms.send();
        sms.log();

    }
}
