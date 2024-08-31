module register.service.services {
    requires org.apache.tomcat.embed.core;
    requires spring.context;

    exports com.github.h3nriquel1ma.registerserviceservices.Services.Session;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Utils;
}