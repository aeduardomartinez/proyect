package com.pruebaSonar.demo.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MensajeDto {

    private String messageCode;
    private String message;
}
