package ie.altech.lotto.server;

import ie.altech.lotto.Bucket;
import ie.altech.lotto.Lottery;
import ie.altech.lotto.Shuffler;
import ie.altech.lotto.ticket.DrawType;
import ie.altech.lotto.ticket.Row;
import ie.altech.lotto.ticket.RowContext;
import ie.altech.lotto.ticket.util.ContextBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LottoServer {

    public static void main(String... args){
        RowContext context = ContextBuilder.build(DrawType.LOTTO);
        Shuffler lottery = new Lottery(context);
        Row line = lottery.completeRow(context);
        System.out.println(line.toString());

        System.setProperty("spring.config.name", "lotto-server");
        SpringApplication.run(LottoServer.class, args);
    }
}
