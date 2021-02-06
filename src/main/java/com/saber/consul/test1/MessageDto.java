package com.saber.consul.test1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class MessageDto {
    private String ip;
    private String port;
    private String env;
}
