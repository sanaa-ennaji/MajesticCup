package org.sanaa.brif10.majesticcup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
    org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
})
public class MajesticCupApplication {

    public static void main(String[] args) {
        SpringApplication.run(MajesticCupApplication.class, args);
    }

}
