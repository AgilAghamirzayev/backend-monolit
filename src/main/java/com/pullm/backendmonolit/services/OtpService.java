package com.pullm.backendmonolit.services;

import com.pullm.backendmonolit.entities.OneTimePassword;

public interface OtpService {
    OneTimePassword generateOTP(String email);
}
