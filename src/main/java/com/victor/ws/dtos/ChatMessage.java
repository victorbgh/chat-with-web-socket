package com.victor.ws.dtos;

import com.victor.ws.data.User;

public record ChatMessage(User from, User to, String text) {
}
