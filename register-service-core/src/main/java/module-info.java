module register.service.core {
    requires org.apache.tomcat.embed.core;
    requires spring.data.jpa;
    requires jakarta.persistence;
    requires static lombok;
    requires register.service.shared;

    exports com.github.h3nriquel1ma.registerservicecore.Repositories;
    exports com.github.h3nriquel1ma.registerservicecore.Models;
    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Utils;
    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;
    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing;
    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation;
    exports com.github.h3nriquel1ma.registerservicecore.Query;
}