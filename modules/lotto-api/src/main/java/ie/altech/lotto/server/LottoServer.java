package ie.altech.lotto.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LottoServer {

    public static void main(String... args){
        System.setProperty("spring.config.name", "lotto-server");
        SpringApplication.run(LottoServer.class, args);
    }
}
