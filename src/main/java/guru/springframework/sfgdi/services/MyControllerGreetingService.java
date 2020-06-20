package guru.springframework.sfgdi.services;


//@Primary
//@Service
public class MyControllerGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - from the PRIMARY bean";
    }
}
