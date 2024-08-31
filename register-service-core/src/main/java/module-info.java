module register.service.core {
    requires jakarta.persistence;
    requires static lombok;
    requires org.apache.tomcat.embed.core;

    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;
}