package guru.springframework.sfgdi.services;

public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello from England";
    }

    @Override
    public String getSpanishGreeting() {
        return "Holla desde Espana";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo aus Deutschland";
    }
}
