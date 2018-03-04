package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Person person = new Person(1,"Maciej","Jahn");
        Person person2 = new Person(2, "Bartek","nemik");
        SpringApplication.run(Application.class, args);
    }
}
