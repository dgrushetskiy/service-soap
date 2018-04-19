package ru.gothmog.jaxws.servicesoap;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.gothmog.jaxws.servicesoap")
public class ServiceSoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSoapApplication.class, args);
    }
}
