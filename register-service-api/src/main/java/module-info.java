module register.service.api {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires com.fasterxml.jackson.annotation;
    requires jakarta.validation;
    requires micrometer.commons;
    requires spring.beans;
    requires register.service.services;
    requires spring.context;
    requires spring.tx;
    requires org.aspectj.weaver;
    requires spring.core;
    requires static lombok;
    requires register.service.core;
    requires org.apache.tomcat.embed.core;

    exports com.github.h3nriquel1ma.registerserviceapi.DTO;
}