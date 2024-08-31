module register.service.api {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires org.apache.tomcat.embed.core;
    requires com.fasterxml.jackson.annotation;
    requires jakarta.validation;
    requires micrometer.commons;
    requires spring.beans;
    requires register.service.services;
    requires spring.context;
}