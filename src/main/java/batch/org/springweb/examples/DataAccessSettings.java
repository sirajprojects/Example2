package batch.org.springweb.examples;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "configuration")
public class DataAccessSettings {

    private String accessClass;
    private boolean testImpl;

    @XmlElement(name = "accessClass")
    public String getAccessClass() {
        return accessClass;
    }

    public void setAccessClass(String accessClass) {
        this.accessClass = accessClass;
    }

    @XmlElement(name = "testImpl")
    public boolean isTestImpl() {
        return testImpl;
    }

    public void setTestImpl(boolean testImpl) {
        this.testImpl = testImpl;
    }
}
