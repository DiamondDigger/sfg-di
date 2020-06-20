package guru.springframework.sfgdi.services;

public class PrimaryGermanGreetingRepository implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    @Override
    public String sayHello() {
        return greetingRepository.getGermanGreeting();
    }
}
