package com.pyf.sms.dto;

import lombok.Data;

@Data
public class SuperFiveDto {

    private Head head;

    private Body body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
