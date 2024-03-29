package com.pullm.backendmonolit.services.impl;

import com.pullm.backendmonolit.entities.OneTimePassword;
import com.pullm.backendmonolit.services.OtpService;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OtpServiceImpl implements OtpService {

    @Override
    public OneTimePassword generateOTP(String email) {
        Random random = new Random();
        int otpValue = random.nextInt(9000) + 1000;
        String otp = String.valueOf(otpValue);

        return OneTimePassword.builder()
                .password(otp)
                .expiredAt(Instant.now().plus(5, ChronoUnit.MINUTES))
                .build();
    }
}
