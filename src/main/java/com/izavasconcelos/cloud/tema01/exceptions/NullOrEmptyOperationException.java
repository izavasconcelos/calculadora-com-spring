package com.izavasconcelos.cloud.tema01.exceptions;

public class NullOrEmptyOperationException extends RuntimeException {
    public NullOrEmptyOperationException(String e) {
        super(e);
    }
}
