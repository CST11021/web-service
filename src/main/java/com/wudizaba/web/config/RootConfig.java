package com.wudizaba.web.config;
 
 
import com.wudizaba.web.service.WebServiceInterface;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

import javax.xml.ws.Endpoint;


@Configuration
@ComponentScan(basePackages={"com.wudizaba.web"})
public class RootConfig {



    @Autowired
    private WebServiceInterface invoiceWebService;

    @Autowired
    private Bus bus;


	@Bean
	public Endpoint invoiceEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, invoiceWebService);
		System.out.println("---------------------------接口发布开始---------------------------------------");
		endpoint.publish("/WebServiceInterface");
		System.out.println("http://localhost:8080/service");
		System.out.println("---------------------------接口发布成功---------------------------------------");
		return endpoint;
	}

}