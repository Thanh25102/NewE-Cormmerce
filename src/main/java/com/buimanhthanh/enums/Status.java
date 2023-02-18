package com.buimanhthanh.enums;

public enum Status {
    ok("ok"),failed("failed"),not_found("not found");
    private String value;
    Status(String value){
        this.value = value;
    }
}
