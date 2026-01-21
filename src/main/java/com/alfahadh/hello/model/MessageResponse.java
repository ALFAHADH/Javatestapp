package com.alfahadh.hello.model;

public class MessageResponse {

    private String message;
    private String environment;
    private String version;
    private String timestamp;

    public MessageResponse(String message, String environment, String version, String timestamp) {
        this.message = message;
        this.environment = environment;
        this.version = version;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getVersion() {
        return version;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
