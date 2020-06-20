package guru.springframework.sfgdi.services;

//@Profile("ES")
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - from Spain(ES) ";
    }
}
