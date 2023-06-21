package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

	@Bean//잘몰라도됨 왜냐하면 Api에서 엔티티를 바로 쓰면안되거든
	Hibernate5Module hibernate5Module() {
		return new Hibernate5Module();
	}
}
