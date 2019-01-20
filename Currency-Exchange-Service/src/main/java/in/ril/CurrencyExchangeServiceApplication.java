package in.ril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import in.ril.configuration.ZkConfig;

@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
		
	}


	
}

