package com.aphar.chatapp.chatroom;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatRoom {
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
