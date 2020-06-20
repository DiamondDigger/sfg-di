package guru.springframework.sfgdi.services;

//@Profile({"EN", "default"})
//@Service("i18nService")
public class I18EnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - from England(EN)";
    }
}
