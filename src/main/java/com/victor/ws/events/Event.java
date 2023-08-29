package com.victor.ws.events;

public record Event<T>(EventType type, T payload) {
}
