package in.ineuron.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.ineuron")
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created :: Zero param constructor...");
	}

	@Bean(name = "dt")
	public LocalDateTime getSystemDateTime() {
		System.out.println("AppConfig.getSystemDateTime()");
		LocalDateTime date = LocalDateTime.now();
		return date;
	}
}
