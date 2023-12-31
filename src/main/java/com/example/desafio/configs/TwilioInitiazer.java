package com.example.desafio.configs;


import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TwilioInitiazer {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitiazer.class);

    @Autowired
    public TwilioInitiazer(TwilioConfiguration twilioConfiguration) {
        Twilio.init(
                twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken()
        );
        LOGGER.info("Twilio initialized ... with account sid {} ", twilioConfiguration.getAccountSid());
    }
}
