package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")

public class PrimaryEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getEnglishGreeting();
    }
}


