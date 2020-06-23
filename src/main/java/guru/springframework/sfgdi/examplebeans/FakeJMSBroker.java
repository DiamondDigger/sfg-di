package guru.springframework.sfgdi.examplebeans;

public class FakeJMSBroker {

    private String jms_userName;
    private String jms_password;
    private String jms_dbUrl;

    public String getJms_userName() {
        return jms_userName;
    }

    public void setJms_userName(String jms_userName) {
        this.jms_userName = jms_userName;
    }

    public String getJms_password() {
        return jms_password;
    }

    public void setJms_password(String jms_password) {
        this.jms_password = jms_password;
    }

    public String getJms_dbUrl() {
        return jms_dbUrl;
    }

    public void setJms_dbUrl(String jms_dbUrl) {
        this.jms_dbUrl = jms_dbUrl;
    }
}
