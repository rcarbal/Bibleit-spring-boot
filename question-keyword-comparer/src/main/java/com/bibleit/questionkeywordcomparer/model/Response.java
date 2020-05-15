package com.bibleit.questionkeywordcomparer.model;

public class Response {
    private final String service;
    private final int status;

    public Response(String service, int status) {
        this.service = service;
        this.status = status;
    }

    public String getService() {
        return service;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "service='" + service + '\'' +
                ", status=" + status +
                '}';
    }
}
