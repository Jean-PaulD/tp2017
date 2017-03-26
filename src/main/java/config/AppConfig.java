package config;

import impl.CarInterfaceImpl;
import interfaces.CarInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jean-Paul D on 2017-03-26.
 */
 @Configuration
 public class AppConfig {
    @Bean(name="calc")
    public CarInterface getService(){
        return new CarInterfaceImpl();    }

    }


