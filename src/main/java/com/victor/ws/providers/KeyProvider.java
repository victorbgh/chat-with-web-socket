package com.victor.ws.providers;

import java.security.PublicKey;

public interface KeyProvider {
    PublicKey getPublicKey(String keyId);
}
