package cat.itacademy.barcelonactiva.sanmiguelalonso.gonzalo.s05.t01.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class S05T01N03SanmiguelalonsoGonzaloApplication {

    public static void main(String[] args) {
        SpringApplication.run(S05T01N03SanmiguelalonsoGonzaloApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
