module register.service.core {
    requires register.service.api;
    requires org.apache.tomcat.embed.core;

    exports com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;
}