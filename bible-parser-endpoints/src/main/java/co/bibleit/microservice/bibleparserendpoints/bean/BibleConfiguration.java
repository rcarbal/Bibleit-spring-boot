package co.bibleit.microservice.bibleparserendpoints.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bible-parser-endpoints")
public class BibleConfiguration implements Configuration {

    private int minimum;
    private int maximum;

    protected BibleConfiguration() {
    }

    public BibleConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public int getConfigurationMaximum() {
        return getMaximum();
    }

    @Override
    public int getConfigurationMinimum() {
        return getMinimum();
    }

    @Override
    public String toString() {
        return "BibleConfiguration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
