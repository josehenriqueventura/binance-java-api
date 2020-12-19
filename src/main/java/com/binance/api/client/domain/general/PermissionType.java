package com.binance.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum PermissionType {
    SPOT,
    MARGIN,
    LEVERAGED;
}
