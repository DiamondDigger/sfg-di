package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms_broker.properties")
})
public class JavaConfig {

    @Value("${guru.userName}")
    private String userName;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dbUrl}")
    private String dbUrl;

    @Value("${guru.jms.userName}")
    private String jms_userName;

    @Value("${guru.jms.password}")
    private String jms_password;

    @Value("${guru.jms.dbUrl}")
    private String jms_dbUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(userName);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);

        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setJms_userName(jms_userName);
        fakeJMSBroker.setJms_password(jms_password);
        fakeJMSBroker.setJms_dbUrl(jms_dbUrl);

        return fakeJMSBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return placeholderConfigurer;
    }
}
