package com.yh.simplechatwithstomp;

import lombok.Data;

@Data
public class Message {
    private String sender;
    private String channelId;
    private String content;
}
