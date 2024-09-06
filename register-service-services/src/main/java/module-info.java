open module register.service.services {
    requires register.service.core;
    requires spring.context;
    requires spring.beans;
    requires org.apache.tomcat.embed.core;
    requires register.service.shared;
    requires spring.security.crypto;
    requires spring.core;
    requires org.apache.commons.codec;

    exports com.github.h3nriquel1ma.registerserviceservices.Services.Session;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Utils;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Validation;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Registration;
    exports com.github.h3nriquel1ma.registerserviceservices.Services.Query;
}