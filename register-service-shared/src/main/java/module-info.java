open module register.service.shared {
    requires static lombok;
    requires com.fasterxml.jackson.annotation;
    requires jakarta.validation;
    requires spring.context;
    requires spring.security.crypto;

    exports com.github.h3nriquel1ma.registerserviceshared.DTO;
}