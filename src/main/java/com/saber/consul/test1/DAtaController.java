package com.saber.consul.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DAtaController {
    @Value(value = "${service.ip}")
    private String ip;
    @Value(value = "${service.port}")
    private String port;
    @Value(value = "${service.env}")
    private String env;

    @GetMapping(value = "/data")
    public MessageDto messageDto() {
        MessageDto dto = new MessageDto();
        dto.setIp(ip);
        dto.setPort(port);
        dto.setEnv(env);
        return dto;
    }
}
