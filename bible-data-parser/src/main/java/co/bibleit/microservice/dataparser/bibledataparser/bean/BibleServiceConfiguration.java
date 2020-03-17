package co.bibleit.microservice.dataparser.bibledataparser.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bible-data-parser")
public class BibleServiceConfiguration implements Configuration {

    private int minimum;
    private int maximum;

    public BibleServiceConfiguration() {
    }

    public BibleServiceConfiguration(int minimum, int maximum) {
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
        return "BibleServiceConfiguration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
