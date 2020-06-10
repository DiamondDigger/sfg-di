package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MyControllerGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - from the PRIMARY bean";
    }
}
