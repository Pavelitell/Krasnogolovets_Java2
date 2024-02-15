package readProperties;

import org.junit.jupiter.api.Test;

public class PropertisesTest {
    @Test
    public void readFromConf() {
        String urlFromConf = ConfigProvider.URL;
        System.out.println(urlFromConf);
    }

}
