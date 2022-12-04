package net.guilhermejr.sistema.monitoramento;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class MonitoramentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoramentoApplication.class, args);
	}

}
