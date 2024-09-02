package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;

public interface VerifyInterface {
    Boolean verifyInfoData(RegisterClientDTO request);
}
