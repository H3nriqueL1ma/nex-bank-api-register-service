module register.service.services {
    requires register.service.core;
    requires register.service.api;
    requires spring.context;
    requires spring.beans;
    requires org.apache.tomcat.embed.core;

    exports com.github.h3nriquel1ma.registerserviceservices.Services.Session;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Utils;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Validation;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;
}