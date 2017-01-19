package com.keemono.logging.base;

import net.logstash.logback.encoder.LogstashEncoder;

public class CustomLogstashEncoder extends LogstashEncoder {

    public void addCustomFields(final String fields){
        super.setCustomFields(fields);
    }
}
