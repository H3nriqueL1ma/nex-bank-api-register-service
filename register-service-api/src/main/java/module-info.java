open module register.service.api {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires micrometer.commons;
    requires spring.beans;
    requires register.service.services;
    requires spring.context;
    requires spring.tx;
    requires org.aspectj.weaver;
    requires spring.core;
    requires register.service.core;
    requires org.apache.tomcat.embed.core;
    requires register.service.shared;
    requires jakarta.validation;
    requires spring.data.jpa;

}