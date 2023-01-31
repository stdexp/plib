package ma.poly.formation.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
	//@Bean
	public ResourceConfig getJerseyServelet() {
		ResourceConfig jerseyServelet=new ResourceConfig();
		jerseyServelet.register(EtudiantJerseyService.class);
		return jerseyServelet;
	}
	@Bean
	public SimpleJaxWsServiceExporter getJAXWS() {
		SimpleJaxWsServiceExporter exporter=new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://0.0.0.0:8585/service");
		return exporter;
	}
}
