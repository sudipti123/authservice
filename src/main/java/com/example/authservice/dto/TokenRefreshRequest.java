package com.example.authservice.dto;

import lombok.Data;

@Data
public class TokenRefreshRequest {

    private String refreshToken;
}
