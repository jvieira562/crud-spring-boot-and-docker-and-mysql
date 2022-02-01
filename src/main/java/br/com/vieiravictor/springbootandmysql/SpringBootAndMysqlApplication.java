package br.com.vieiravictor.springbootandmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.vieiravictor.springbootandmysql")
@EntityScan(basePackages = "br.com.vieiravictor.springbootandmysql.model")
public class SpringBootAndMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndMysqlApplication.class, args);
	}

}
