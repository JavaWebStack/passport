package org.javawebstack.passport.services.oauth2;

import org.javawebstack.httpserver.Exchange;

public interface OAuth2CallbackHandler {
    Object callback(Exchange exchange, OAuth2Callback callback);
}