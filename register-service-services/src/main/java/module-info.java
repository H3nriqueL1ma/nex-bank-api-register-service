module register.service.services {
    requires spring.context;
    requires register.service.core;
    requires org.apache.tomcat.embed.core;
    requires spring.beans;

    exports com.github.h3nriquel1ma.registerserviceservices.Services.Session;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Utils;
}